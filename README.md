# Aircraft Simulation System

Welcome to the Aircraft Simulation System! This project aims to simulate the functionalities of actual airplanes and helicopters via a console interface. It utilizes various design patterns such as Factory, Abstract Factory, Builder, and State to create and manage aircraft objects with realistic behaviors.

## Features

- **Aircraft Simulation:**
  - Simulate the functionalities of airplanes and helicopters through a console interface.
  - Use Factory, Abstract Factory, and Builder patterns to create aircraft objects.
  - Implement State design pattern to manage the aircraft's state (on/off).
  - Aircraft will explode if flown above a certain height, prompting the user to repair or build a new aircraft.
  - Aircraft cannot fly if the engine is off; turning on the engine activates all other functionalities such as ascending, descending, and take-off.
  - Descending functionality prevents the aircraft from going below altitude 0 to avoid fatal crashes; landing automatically occurs at altitude 0.

## Installation

To run this project locally, follow these steps:

1. Clone the GitHub repository to your local machine.
2. Compile and build the project using your preferred IDE or compiler.
3. Run the executable file generated after compilation.

## Usage

1. Start the application and access the console interface.
2. Use the available commands to interact with the aircraft:
   - Turn on/off the engine.
   - Ascend or descend the aircraft.
   - Take off or land the aircraft.
   - Repair or build a new aircraft if necessary.
3. Monitor the altitude and state of the aircraft to prevent crashes and ensure safe operation.
4. Utilize the console interface to make decisions regarding repairs, building new aircraft, and other actions.

## Contributing

Contributions to this project are welcome! If you have any suggestions, bug reports, or feature requests, please open an issue on GitHub or submit a pull request.

## License

This project is licensed under the [MIT License](LICENSE).
