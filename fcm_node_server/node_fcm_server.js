var admin=require('firebase-admin')
var serviceAccount=require('./server_key.json')

admin.initializeApp({
    credential: admin.credential.cert(serviceAccount)
})

var token="dpIpgh_ETYajN-XsaSO1G8:APA91bGgO-C4Dzb1ccxGfxNFco5JY77pTjR746hvlY6eKn59KwFM3GcywgnpMkEYuj8EQXVdwb4MPAQeK4SeTQSPModxpOSCeBMIYoMlz4kcASYerAuq10cCwPewS5zBpLqhXon5L2Yu"
var fcm_message = {
    notification: {
        title:'noti title',
        body: 'noti body..'
    },
    data: {
        title:'data title',
        value: '20'
    },
    token: token
}

admin.messaging().send(fcm_message)
    .then(function(response){
        console.log('send ok...')
    })
    .catch(function(error){
        console.log('send error...')
    })
