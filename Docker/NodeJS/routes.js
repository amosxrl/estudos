const express = require('express');

const DockerController = require('./DockerController')

const routes = express.Router();

module.exports = routes.get('/hello-docker', DockerController.greeting);