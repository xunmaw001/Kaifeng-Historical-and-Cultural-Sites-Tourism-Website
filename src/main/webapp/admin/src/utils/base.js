const base = {
    get() {
        return {
            url : "http://localhost:8080/kaifengmingshenggujilvyou/",
            name: "kaifengmingshenggujilvyou",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/kaifengmingshenggujilvyou/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "开封名胜古迹旅游网站"
        } 
    }
}
export default base