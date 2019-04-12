if (defined.PRODUCTION) {
    // noinspection JSUnresolvedFunction
    config.plugins.push(new webpack.optimize.UglifyJsPlugin({
        minimize: true
    }));
}
