class Solution {
public:
    string mergeAlternately(string word1, string word2) {
        std::string result;
        int n = std::min(word1.length(), word2.length());

        for (int i = 0; i < n; ++i) {
            result += word1[i];
            result += word2[i];
        }

        if (word1.length() > word2.length())
            result += word1.substr(n);
        else 
            result += word2.substr(n);
        
        return result;
    }
};