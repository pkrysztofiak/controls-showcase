# FilterInputShowcase
Presents the proper way to filter `TextField` input. `TextFormatter` filters input in contrast to `TextField.textProperty().addListener()` which allows to replace already existing text, creating many issues at the same time e.g. cursor position.

# EmailHitEndShowcase
Presents correct way to validate email input. Validation checks wheather email is correct or is on a right path to be correct, e.g. `p.krysztofiak@` is not a correct email but is on a right path to be one.  