module.exports = {
    async greeting(request, response) {
        var hostName = ProcessingInstruction.env.HOSTNAME;

        return response.json({
            content: "Hello Docker",
            enviromment: hostName
        });
    }
}