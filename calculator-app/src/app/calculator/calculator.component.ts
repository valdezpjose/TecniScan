import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { HttpClient } from '@angular/common/http';
import { CommonModule } from '@angular/common';
import { MatButtonModule } from '@angular/material/button';
import { MatInputModule } from '@angular/material/input';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatCardModule } from '@angular/material/card';
import { ReactiveFormsModule } from '@angular/forms';

@Component({
  selector: 'app-calculator',
  templateUrl: './calculator.component.html',
  styleUrls: ['./calculator.component.css'],
  standalone: true,
  imports: [
    CommonModule,
    MatButtonModule,
    MatInputModule,
    MatFormFieldModule,
    MatCardModule,
    ReactiveFormsModule
  ]
})
export class CalculatorComponent {
  calcForm: FormGroup;
  result: number | null = null;
  operation: string = 'sum';

  constructor(private fb: FormBuilder, private http: HttpClient) {
    this.calcForm = this.fb.group({
      operand1: ['', Validators.required],
      operand2: ['', Validators.required]
    });
  }

  setOperation(op: string) {
    this.operation = op;
  }

  isActive(op: string): boolean {
    return this.operation === op;
  }

  calculate() {
    if (this.calcForm.valid) {
      const { operand1, operand2 } = this.calcForm.value;
      const url = `http://localhost:8080/${this.operation}?a=${operand1}&b=${operand2}`;

      this.http.get<{ result: number }>(url).subscribe(response => {
        this.result = response.result;
      }, error => {
        console.error('Error:', error);
        this.result = null;
      });
    }
  }
}
