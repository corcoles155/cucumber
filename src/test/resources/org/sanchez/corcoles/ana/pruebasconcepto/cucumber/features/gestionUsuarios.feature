Feature: Ejemplo de uso de Cucumber en el que se van a probar diferentes funcionalidades referentes a la gestión de usuarios
  Scenario: Crear usuario
    Given Tenemos la clase GestionUsuarios inicializada
    When Introducimos los datos del usuario que queremos crear: <entrada>
    | Id | Nombre | Apellidos | Edad |
    | 1  | Ana    | Córcoles  | 26   |
    Then Nos devuelve el id del usuario creado:
    | 1 |

  Scenario: Obtener usuario
    Given Tenemos la clase GestionUsuarios inicializada
    And un usuario creado con el id 1
    When Introducimos el valor del id del usuario: 1
    Then Nos devuelve el usuario <entrada>
      | Id | Nombre | Apellidos | Edad |
      | 1  | Ana    | Córcoles  | 26   |

    Scenario: Elminar usuario que existe en nuestra lista de usuarios
      Given Tenemos la clase GestionUsuarios inicializada
      And un usuario creado con el id 1
      When Eliminamos el usuario con id: 1
      Then Nos devuelve un booleano con el valor true

  Scenario: Elminar usuario que no existe en nuestra lista de usuarios
    Given Tenemos la clase GestionUsuarios inicializada
    When Eliminamos el usuario con id: 1
    Then Nos devuelve un booleano con el valor false

