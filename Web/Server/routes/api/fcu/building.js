var express = require('express');
var router = express.Router();
var mongoose = require('mongoose');
var Building = require('../../../modules/schema/Building.js');
var config = require('../../../building.json');

/* GET */
// get all building info from db
router.get('/', function(req, res, next) {
    let data = [];
    for (var index = 0; index < config.length; index++) {
        let introduction = config[index]['info']['introduction']
        if (introduction)
            data.push({
                id: config[index]['_id'],
                name: config[index]['building_name'],
                location: {
                    building: config[index]['building_type'],
                    location: config[index]['building_location']['location'].replace(' ', '')
                },
                info: {
                    introduction: introduction,
                    image: config[index]['info']['image']
                }
            })
    }
    res.json(data)
});

// get specify building id info from db
router.get('/:id', function(req, res, next) {
    let data
    config.forEach(element => {
        if (req.params.id == element._id) {
            data = {
                name: element['building_name'],
                building: element['building_type'],
                info: element['info']
            }
            return
        }
    });
    console.log(data)
    res.json(data);
});

/* POST */
//TODO
router.post('/', function(req, res, next) {
    Building.create(req.body, function(err, post) {
        if (err) {
            console.log(err);
            return next(err);
        }
        console.log('Post Successfully.\n' + post);
        res.json(post);
    });
});

module.exports = router;

//ensureIndex({})