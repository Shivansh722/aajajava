#include <iostream>

using namespace std;

int main() {
    int num, temp, digit, rev = 0;
    cout << "Enter a number: ";
    cin >> num;
    temp = num;
    for ( ; temp != 0; temp /= 10) {
        digit = temp % 10;
        rev = rev * 10 + digit;
    }
    if (rev == num) {
        cout << "The number is a palindrome." << endl;
    } else {
        cout << "The number is not a palindrome." << endl;
    }
    return 0;
}
