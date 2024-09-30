import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { Component1Component } from "./component1/component1.component";

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, Component1Component],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'testAngular';
}
