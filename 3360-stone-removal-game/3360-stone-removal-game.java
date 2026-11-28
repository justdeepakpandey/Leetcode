class Solution {
    public boolean canAliceWin(int n) {
        int temp = 10;
        boolean alice = true;

        while (n >= temp) {
            n = n - temp;
            temp--;

            alice = !alice;
        }

        return !alice;
    }
}