const newman = require('newman');

// call newman.run to pass `options` object and wait for callback
newman.run({
    collection: require('./postman/collections/NOVA Security Tests_e438b0c3-97c2-46fa-b650-f154724258c8.json'),
    environment: require('./postman/environments/nova-security-tests.json')
    reporters: 'cli'
}, function (err) {
    if (err) { throw err; }
    console.log('collection run complete!');
});