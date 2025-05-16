# Multi-Module-Android-dev-environment

## Local development 

1. Open the project in Android Studio. You have to open the `app/` directory, not the root directory of the project.
2. Open the `local.properties` file and add the following lines:

```
githubpackages.user=YOUR_GITHUB_USERNAME
githubpackages.key=YOUR_GITHUB_TOKEN
workingLocally=true
```

- **YOUR_GITHUB_USERNAME**: This is your GitHub username (the one you use to log in to github.com).
- **YOUR_GITHUB_TOKEN**: This is a [GitHub personal access token](https://github.com/settings/tokens) with at least the `read:packages` scope. You can generate one by:
    1. Going to [GitHub Personal Access Tokens](https://github.com/settings/tokens).
    2. Clicking "Generate new token".
    3. Giving it a name, selecting the `read:packages` scope, and generating the token.
    4. Copying the token and pasting it as the value for `githubpackages.key`.
- **workingLocally**: Set to `true` to use local modules for development. Set to `false` to use remote dependencies from GitHub Packages.

**Note:** Never commit your `local.properties` file or your token to version control.

3. Clone the repo: https://github.com/levibostian/Multi-Module-Android-dev-environment-lib, to the same directory as this repo is inside of. 
