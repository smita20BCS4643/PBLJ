package smita;

class UserMainCode {
    public int originalArray(int input1, int[] input2) {
        int n = input1;

        for (int len = 1; len <= n; len++) {
            boolean valid = true;
            int i = 0;

            while (i < n) {
                boolean matched = false;
                for (int start = 0; start < len; start++) {
                    for (int end = start + 1; end <= len; end++) {
                        int subLen = end - start;
                        if (i + subLen > n) continue;

                        boolean equal = true;
                        for (int k = 0; k < subLen; k++) {
                            if (input2[i + k] != input2[start + k]) {
                                equal = false;
                                break;
                            }
                        }

                        if (equal) {
                            matched = true;
                            i += subLen;
                            break;
                        }
                    }
                    if (matched) break;
                }

                if (!matched) {
                    valid = false;
                    break;
                }
            }

            if (valid) return len;
        }

        throw new UnsupportedOperationException("originalArray(int input1, int[] input2): No valid pattern found.");
    }
}
