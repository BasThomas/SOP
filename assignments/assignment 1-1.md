# Branches
## Bugfix / minor release
Format: `fix-version-specific_fix`

Example: `fix-2.0.1-crash_on_login`

Create Pull Request, review by at least one other team member.
Merge when reviewed by team member and CI (all tests passing).

Note: I also recommend using `2.0.1` naming for bugfixes instead of `2.01` as this leaves some space for "minor-major" releases. Also, arguably, this embraces clarity. 

## Major release
Format: `major-version-team-implementation`

Example: `major-4.0.0-a1-backend_gps_traffic_info`

Via the same rules as mentioned above, these can be merged at the end of a sprint into:

Format: `major-version`

Example: `major-4.0.0`

## Test
The testing team is responsible for creating a Pull Request to merge a major release into master.
