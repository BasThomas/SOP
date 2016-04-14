# Software integrations
## Issue management
For issue management, we are using the built-in `Issues` in [GitHub](https://github.com). ([image](/images/issue_tracker.png))

### Merging
We are using [GitHub](https://github.com)'s `Pull requests` to merge commits to a specific branch. ([image](/images/git_pull_request.png))

## Version Control
Well, take a look around you! We are using [GitHub](https://github.com) as the VCS.

## Integrated Development Environment
We are using [Xcode](https://developer.apple.com/xcode/), writing software in [Swift](https://developer.apple.com/swift/). ([image](/images/git_ide.png))

## Code coverage
We are using the built-in code coverage provided by [Xcode](https://developer.apple.com/xcode/). ([image](/images/code_coverage.png))

### Branches
As for the branching, we are using at least five branches:
- [x] Master
- [x] Major
- [x] Major-team
- [x] Minor
- [x] Bugfix
 
As clarified in [assignment 1-1.md](assignment 1-1):

- The `bugfix` team merges `bugfixes` into a `minor` release. (orange)
- The `testing` team merges `minor` into `major`. (green)
- One of the `major` teams merges `major-team` into `major`. (blue)
- The `testing` team then merges `major` into `master`. (green) ([image](/images/branches_sketch.png))
