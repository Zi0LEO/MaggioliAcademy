import { Component, OnInit } from "@angular/core";
import { Hero } from "../hero";
import { NgFor } from "@angular/common";
import { HeroService } from "../hero.service";
import { MessageService } from "../message.service";

@Component({
	selector: "app-heroes",
	templateUrl: "./heroes.component.html",
	styleUrl: "./heroes.component.css",
})
export class HeroesComponent implements OnInit {
	constructor(
		private heroService: HeroService,
		private messageService: MessageService,
	) {}

	heroes: Hero[] = [];
	selectedHero?: Hero;

	onSelect(hero: Hero): void {
		this.selectedHero = hero;
		this.messageService.add(`HeroesComponent: Selected hero id=${hero.id}`);
	}

	getHeroes(): void {
		this.heroService.getHeroes().subscribe((heroes) => (this.heroes = heroes));
	}

	ngOnInit(): void {
		this.getHeroes();
	}
}
