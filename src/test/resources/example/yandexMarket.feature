Feature: Читаем информацию про macbook air в Wikipedia.org
  Background: Я нахожусь на главной странице
    Given Открываем сайт "https://ru.wikipedia.org"
  Scenario: Заходим на сайт, в поиске ищем macbook air
    When Авторизируемся на сайте с логином "Bisquitee" и паролем "Kiri11ov198"
    And На главной странице находим строку поиска
    And В строке поиска вводим текст "macbook air m1"
    And Перейти в первый элемент списка результатов поиска
    And Переходим по содержанию Apple M1 Ultra
    Then Выходим из учетной записи

