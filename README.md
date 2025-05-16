# Multi-Module-Android-dev-environment

## Local development 

1. Open the project in Android Studio.
2. Open the `local.properties` file and add the following lines:

```
githubpackages.user=YOUR_GITHUB_USERNAME
githubpackages.key=YOUR_GITHUB_TOKEN
```

- **YOUR_GITHUB_USERNAME**: This is your GitHub username (the one you use to log in to github.com).
- **YOUR_GITHUB_TOKEN**: This is a [GitHub personal access token](https://github.com/settings/tokens) with at least the `read:packages` scope. You can generate one by:
    1. Going to [GitHub Personal Access Tokens](https://github.com/settings/tokens).
    2. Clicking "Generate new token".
    3. Giving it a name, selecting the `read:packages` scope, and generating the token.
    4. Copying the token and pasting it as the value for `githubpackages.key`.

**Note:** Never commit your `local.properties` file or your token to version control.