package by.academy.homework2.task5;

//������� ��������� Validator, � ������� validate, ����������� ������, ��������� true/false.
//�������� ����� AmericanPhoneValidator, ������� ���������� ������������ �������(������������ �� +1...)
//�������� ����� BelarusPhoneValidator, ������� ���������� ����������� �������(������������ �� +375...) 
//�������� ����� EmailValidator � ������ main, ������������ email.
//��� ��� ������ ������ ����������� ��������� Validator.

public interface Validator {

	boolean validate(String vString);

}
