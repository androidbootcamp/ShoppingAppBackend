# This sh files uses zsh aliases for docker that are not a part of the main repo yet. They can be found at -
# https://github.com/abhinavmanchanda/oh-my-zsh/blob/master/plugins/docker/docker.plugin.zsh

dnc shoppingapp
dr -d --name postgres -e POSTGRES_PASSWORD=shopping -e POSTGRES_USER=shoppingapp -v $(pwd)/data:/var/lib/postgresql/data --network shoppingapp postgres:9.6.2
dib -f docker/SpringDockerfile -t shopping-backend-manual-build .
dr -d -p 8000:8080 --name shoppingweb --network shoppingapp shopping-backend-manual-build