# Assignment2
# Wildlife Rescue Operations System

## Project Overview

The Wildlife Rescue Operations System is a Java console application developed for the PROG6112 practical assignment.

The system is designed to manage wildlife rescue cases for a wildlife conservation organisation. It allows users to add, search, update and display rescue cases, as well as calculate rescue costs and rescue priorities.

## Technologies Used

- Java
- Apache Maven
- NetBeans IDE
- JUnit 5
- GitHub

## Main Features

- Add wildlife rescue cases
- Search for a rescue case using its Rescue Case ID
- Update rescue case status
- Display all rescue cases
- Calculate total rescue costs
- Generate a rescue report
- Validate required information
- Prevent duplicate Rescue Case IDs
- Calculate rescue priorities
- Unit testing using JUnit

## Rescue Case Types

The system supports three rescue case types:

### Injured Animal Rescue
Handles rescue cases involving injured animals and includes veterinary treatment and surgery information.

### Orphaned Animal Rescue
Handles orphaned animals and includes estimated age, feeding costs and foster care information.

### Endangered Species Rescue
Handles endangered species and includes conservation classification, security costs and specialist team requirements.

## Object-Oriented Programming Concepts

The project demonstrates:

- Abstraction
- Inheritance
- Encapsulation
- Interfaces
- Method overriding
- Polymorphism

## Validation

The application validates important information including:

- Rescue Case ID cannot be blank
- Rescue Case IDs must be unique
- Species cannot be blank
- Rescue Location cannot be blank
- Assigned Ranger cannot be blank
- Rescue type selections must be valid
- Rescue days must be greater than zero
- Daily care cost cannot be negative

## JUnit Testing

JUnit 5 was used to test the following requirements:

- Rescue cost calculations
- Rescue priority calculations
- Rescue status updates
- Searching for an existing rescue case
- Preventing duplicate Rescue Case IDs

## Currency

All rescue costs are displayed in South African Rands (R).

## Use of AI Tools

ChatGPT was used as a consultation and learning support tool during the development of this project. It was used to clarify programming concepts, assist with troubleshooting, explain errors, and provide guidance on Java, Maven and JUnit implementation.

The student reviewed, tested and implemented the code in the NetBeans development environment.

