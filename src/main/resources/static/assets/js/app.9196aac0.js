(function(e){function t(t){for(var a,r,c=t[0],i=t[1],u=t[2],f=0,l=[];f<c.length;f++)r=c[f],Object.prototype.hasOwnProperty.call(s,r)&&s[r]&&l.push(s[r][0]),s[r]=0;for(a in i)Object.prototype.hasOwnProperty.call(i,a)&&(e[a]=i[a]);d&&d(t);while(l.length)l.shift()();return o.push.apply(o,u||[]),n()}function n(){for(var e,t=0;t<o.length;t++){for(var n=o[t],a=!0,r=1;r<n.length;r++){var c=n[r];0!==s[c]&&(a=!1)}a&&(o.splice(t--,1),e=i(i.s=n[0]))}return e}var a={},r={app:0},s={app:0},o=[];function c(e){return i.p+"assets/js/"+({}[e]||e)+"."+{"chunk-043d8723":"918eab33","chunk-080d767c":"1fbf3605","chunk-0ca9d94f":"1dc87d6c","chunk-26c77f9a":"4355c994","chunk-3d3ce248":"721b0dc8","chunk-592b65c2":"d27feb54","chunk-abe6e3e0":"490e52d5"}[e]+".js"}function i(t){if(a[t])return a[t].exports;var n=a[t]={i:t,l:!1,exports:{}};return e[t].call(n.exports,n,n.exports,i),n.l=!0,n.exports}i.e=function(e){var t=[],n={"chunk-0ca9d94f":1,"chunk-abe6e3e0":1};r[e]?t.push(r[e]):0!==r[e]&&n[e]&&t.push(r[e]=new Promise((function(t,n){for(var a="assets/css/"+({}[e]||e)+"."+{"chunk-043d8723":"31d6cfe0","chunk-080d767c":"31d6cfe0","chunk-0ca9d94f":"131119fc","chunk-26c77f9a":"31d6cfe0","chunk-3d3ce248":"31d6cfe0","chunk-592b65c2":"31d6cfe0","chunk-abe6e3e0":"8ba55b7c"}[e]+".css",s=i.p+a,o=document.getElementsByTagName("link"),c=0;c<o.length;c++){var u=o[c],f=u.getAttribute("data-href")||u.getAttribute("href");if("stylesheet"===u.rel&&(f===a||f===s))return t()}var l=document.getElementsByTagName("style");for(c=0;c<l.length;c++){u=l[c],f=u.getAttribute("data-href");if(f===a||f===s)return t()}var d=document.createElement("link");d.rel="stylesheet",d.type="text/css",d.onload=t,d.onerror=function(t){var a=t&&t.target&&t.target.src||s,o=new Error("Loading CSS chunk "+e+" failed.\n("+a+")");o.code="CSS_CHUNK_LOAD_FAILED",o.request=a,delete r[e],d.parentNode.removeChild(d),n(o)},d.href=s;var h=document.getElementsByTagName("head")[0];h.appendChild(d)})).then((function(){r[e]=0})));var a=s[e];if(0!==a)if(a)t.push(a[2]);else{var o=new Promise((function(t,n){a=s[e]=[t,n]}));t.push(a[2]=o);var u,f=document.createElement("script");f.charset="utf-8",f.timeout=120,i.nc&&f.setAttribute("nonce",i.nc),f.src=c(e);var l=new Error;u=function(t){f.onerror=f.onload=null,clearTimeout(d);var n=s[e];if(0!==n){if(n){var a=t&&("load"===t.type?"missing":t.type),r=t&&t.target&&t.target.src;l.message="Loading chunk "+e+" failed.\n("+a+": "+r+")",l.name="ChunkLoadError",l.type=a,l.request=r,n[1](l)}s[e]=void 0}};var d=setTimeout((function(){u({type:"timeout",target:f})}),12e4);f.onerror=f.onload=u,document.head.appendChild(f)}return Promise.all(t)},i.m=e,i.c=a,i.d=function(e,t,n){i.o(e,t)||Object.defineProperty(e,t,{enumerable:!0,get:n})},i.r=function(e){"undefined"!==typeof Symbol&&Symbol.toStringTag&&Object.defineProperty(e,Symbol.toStringTag,{value:"Module"}),Object.defineProperty(e,"__esModule",{value:!0})},i.t=function(e,t){if(1&t&&(e=i(e)),8&t)return e;if(4&t&&"object"===typeof e&&e&&e.__esModule)return e;var n=Object.create(null);if(i.r(n),Object.defineProperty(n,"default",{enumerable:!0,value:e}),2&t&&"string"!=typeof e)for(var a in e)i.d(n,a,function(t){return e[t]}.bind(null,a));return n},i.n=function(e){var t=e&&e.__esModule?function(){return e["default"]}:function(){return e};return i.d(t,"a",t),t},i.o=function(e,t){return Object.prototype.hasOwnProperty.call(e,t)},i.p="",i.oe=function(e){throw console.error(e),e};var u=window["webpackJsonp"]=window["webpackJsonp"]||[],f=u.push.bind(u);u.push=t,u=u.slice();for(var l=0;l<u.length;l++)t(u[l]);var d=f;o.push([0,"chunk-vendors"]),n()})({0:function(e,t,n){e.exports=n("56d7")},"034f":function(e,t,n){"use strict";n("85ec")},1:function(e,t){},10:function(e,t){},2:function(e,t){},3:function(e,t){},4:function(e,t){},4360:function(e,t,n){"use strict";var a=n("2b0e"),r=n("2f62");a["a"].use(r["a"]),t["a"]=new r["a"].Store({state:{token:""},mutations:{},actions:{},modules:{}})},4678:function(e,t,n){var a={"./af":"2bfb","./af.js":"2bfb","./ar":"8e73","./ar-dz":"a356","./ar-dz.js":"a356","./ar-kw":"423e","./ar-kw.js":"423e","./ar-ly":"1cfd","./ar-ly.js":"1cfd","./ar-ma":"0a84","./ar-ma.js":"0a84","./ar-sa":"8230","./ar-sa.js":"8230","./ar-tn":"6d83","./ar-tn.js":"6d83","./ar.js":"8e73","./az":"485c","./az.js":"485c","./be":"1fc1","./be.js":"1fc1","./bg":"84aa","./bg.js":"84aa","./bm":"a7fa","./bm.js":"a7fa","./bn":"9043","./bn-bd":"9686","./bn-bd.js":"9686","./bn.js":"9043","./bo":"d26a","./bo.js":"d26a","./br":"6887","./br.js":"6887","./bs":"2554","./bs.js":"2554","./ca":"d716","./ca.js":"d716","./cs":"3c0d","./cs.js":"3c0d","./cv":"03ec","./cv.js":"03ec","./cy":"9797","./cy.js":"9797","./da":"0f14","./da.js":"0f14","./de":"b469","./de-at":"b3eb","./de-at.js":"b3eb","./de-ch":"bb71","./de-ch.js":"bb71","./de.js":"b469","./dv":"598a","./dv.js":"598a","./el":"8d47","./el.js":"8d47","./en-au":"0e6b","./en-au.js":"0e6b","./en-ca":"3886","./en-ca.js":"3886","./en-gb":"39a6","./en-gb.js":"39a6","./en-ie":"e1d3","./en-ie.js":"e1d3","./en-il":"7333","./en-il.js":"7333","./en-in":"ec2e","./en-in.js":"ec2e","./en-nz":"6f50","./en-nz.js":"6f50","./en-sg":"b7e9","./en-sg.js":"b7e9","./eo":"65db","./eo.js":"65db","./es":"898b","./es-do":"0a3c","./es-do.js":"0a3c","./es-mx":"b5b7","./es-mx.js":"b5b7","./es-us":"55c9","./es-us.js":"55c9","./es.js":"898b","./et":"ec18","./et.js":"ec18","./eu":"0ff2","./eu.js":"0ff2","./fa":"8df4","./fa.js":"8df4","./fi":"81e9","./fi.js":"81e9","./fil":"d69a","./fil.js":"d69a","./fo":"0721","./fo.js":"0721","./fr":"9f26","./fr-ca":"d9f8","./fr-ca.js":"d9f8","./fr-ch":"0e49","./fr-ch.js":"0e49","./fr.js":"9f26","./fy":"7118","./fy.js":"7118","./ga":"5120","./ga.js":"5120","./gd":"f6b4","./gd.js":"f6b4","./gl":"8840","./gl.js":"8840","./gom-deva":"aaf2","./gom-deva.js":"aaf2","./gom-latn":"0caa","./gom-latn.js":"0caa","./gu":"e0c5","./gu.js":"e0c5","./he":"c7aa","./he.js":"c7aa","./hi":"dc4d","./hi.js":"dc4d","./hr":"4ba9","./hr.js":"4ba9","./hu":"5b14","./hu.js":"5b14","./hy-am":"d6b6","./hy-am.js":"d6b6","./id":"5038","./id.js":"5038","./is":"0558","./is.js":"0558","./it":"6e98","./it-ch":"6f12","./it-ch.js":"6f12","./it.js":"6e98","./ja":"079e","./ja.js":"079e","./jv":"b540","./jv.js":"b540","./ka":"201b","./ka.js":"201b","./kk":"6d79","./kk.js":"6d79","./km":"e81d","./km.js":"e81d","./kn":"3e92","./kn.js":"3e92","./ko":"22f8","./ko.js":"22f8","./ku":"2421","./ku.js":"2421","./ky":"9609","./ky.js":"9609","./lb":"440c","./lb.js":"440c","./lo":"b29d","./lo.js":"b29d","./lt":"26f9","./lt.js":"26f9","./lv":"b97c","./lv.js":"b97c","./me":"293c","./me.js":"293c","./mi":"688b","./mi.js":"688b","./mk":"6909","./mk.js":"6909","./ml":"02fb","./ml.js":"02fb","./mn":"958b","./mn.js":"958b","./mr":"39bd","./mr.js":"39bd","./ms":"ebe4","./ms-my":"6403","./ms-my.js":"6403","./ms.js":"ebe4","./mt":"1b45","./mt.js":"1b45","./my":"8689","./my.js":"8689","./nb":"6ce3","./nb.js":"6ce3","./ne":"3a39","./ne.js":"3a39","./nl":"facd","./nl-be":"db29","./nl-be.js":"db29","./nl.js":"facd","./nn":"b84c","./nn.js":"b84c","./oc-lnc":"167b","./oc-lnc.js":"167b","./pa-in":"f3ff","./pa-in.js":"f3ff","./pl":"8d57","./pl.js":"8d57","./pt":"f260","./pt-br":"d2d4","./pt-br.js":"d2d4","./pt.js":"f260","./ro":"972c","./ro.js":"972c","./ru":"957c","./ru.js":"957c","./sd":"6784","./sd.js":"6784","./se":"ffff","./se.js":"ffff","./si":"eda5","./si.js":"eda5","./sk":"7be6","./sk.js":"7be6","./sl":"8155","./sl.js":"8155","./sq":"c8f3","./sq.js":"c8f3","./sr":"cf1e","./sr-cyrl":"13e9","./sr-cyrl.js":"13e9","./sr.js":"cf1e","./ss":"52bd","./ss.js":"52bd","./sv":"5fbd","./sv.js":"5fbd","./sw":"74dc","./sw.js":"74dc","./ta":"3de5","./ta.js":"3de5","./te":"5cbb","./te.js":"5cbb","./tet":"576c","./tet.js":"576c","./tg":"3b1b","./tg.js":"3b1b","./th":"10e8","./th.js":"10e8","./tk":"5aff","./tk.js":"5aff","./tl-ph":"0f38","./tl-ph.js":"0f38","./tlh":"cf75","./tlh.js":"cf75","./tr":"0e81","./tr.js":"0e81","./tzl":"cf51","./tzl.js":"cf51","./tzm":"c109","./tzm-latn":"b53d","./tzm-latn.js":"b53d","./tzm.js":"c109","./ug-cn":"6117","./ug-cn.js":"6117","./uk":"ada2","./uk.js":"ada2","./ur":"5294","./ur.js":"5294","./uz":"2e8c","./uz-latn":"010e","./uz-latn.js":"010e","./uz.js":"2e8c","./vi":"2921","./vi.js":"2921","./x-pseudo":"fd7e","./x-pseudo.js":"fd7e","./yo":"7f33","./yo.js":"7f33","./zh-cn":"5c3a","./zh-cn.js":"5c3a","./zh-hk":"49ab","./zh-hk.js":"49ab","./zh-mo":"3a6c","./zh-mo.js":"3a6c","./zh-tw":"90ea","./zh-tw.js":"90ea"};function r(e){var t=s(e);return n(t)}function s(e){if(!n.o(a,e)){var t=new Error("Cannot find module '"+e+"'");throw t.code="MODULE_NOT_FOUND",t}return a[e]}r.keys=function(){return Object.keys(a)},r.resolve=s,e.exports=r,r.id="4678"},5:function(e,t){},"56d7":function(e,t,n){"use strict";n.r(t);n("e260"),n("e6cf"),n("cca6"),n("a79d");var a=n("2b0e"),r=function(){var e=this,t=e.$createElement,n=e._self._c||t;return n("div",{attrs:{id:"app"}},[n("router-view")],1)},s=[],o=(n("034f"),n("2877")),c={},i=Object(o["a"])(c,r,s,!1,null,null,null),u=i.exports,f=n("a18c"),l=n("4360"),d=n("bc3a"),h=n.n(d),m=n("f23d");n("202f");a["a"].prototype.$axios=h.a,a["a"].use(m["a"]),a["a"].config.productionTip=!1,new a["a"]({router:f["a"],store:l["a"],render:function(e){return e(u)}}).$mount("#app")},6:function(e,t){},7:function(e,t){},8:function(e,t){},"85ec":function(e,t,n){},9:function(e,t){},a18c:function(e,t,n){"use strict";n("d3b7");var a=n("2b0e"),r=n("8c4f"),s=function(){var e=this,t=e.$createElement,n=e._self._c||t;return n("div",{staticClass:"login-container"},[n("h2",{staticClass:"login-title"}),n("a-form-model",{ref:"form",staticClass:"login-form",staticStyle:{margin:"0 auto"},attrs:{model:e.form}},[n("h2",{staticClass:"title"},[e._v("用户登录 LOGIN")]),n("a-form-model-item",{attrs:{"wrapper-col":{span:14,offset:5}}},[n("a-input",{model:{value:e.form.username,callback:function(t){e.$set(e.form,"username",t)},expression:"form.username"}},[n("a-icon",{staticStyle:{color:"rgba(0,0,0,.25)"},attrs:{slot:"prefix",type:"user"},slot:"prefix"})],1)],1),n("a-form-model-item",{attrs:{"wrapper-col":{span:14,offset:5}}},[n("a-input-password",{model:{value:e.form.password,callback:function(t){e.$set(e.form,"password",t)},expression:"form.password"}},[n("a-icon",{staticStyle:{color:"rgba(0,0,0,.25)"},attrs:{slot:"prefix",type:"lock"},slot:"prefix"})],1)],1),n("a-form-model-item",{attrs:{"wrapper-col":{span:14,offset:5}}},[n("a-radio-group",{staticStyle:{color:"#fff"},model:{value:e.form.model,callback:function(t){e.$set(e.form,"model",t)},expression:"form.model"}},[n("a-radio",{staticStyle:{color:"#fff"},attrs:{value:"Mongoose"}},[e._v(" Mongoose ")]),n("a-radio",{staticStyle:{color:"#fff"},attrs:{value:"Badger"}},[e._v(" Badger ")]),n("a-radio",{staticStyle:{color:"#fff"},attrs:{value:"Bison"}},[e._v(" Bison ")])],1)],1),n("a-form-model-item",{attrs:{"wrapper-col":{span:14,offset:5}}},[n("a-button",{staticClass:"submit",attrs:{type:"primary"},on:{click:e.subLogin}},[e._v("登录")])],1)],1)],1)},o=[],c=(n("ac1f"),n("5319"),n("4360"),n("b775"));function i(e){var t=new FormData;return t.append("username",e.username),t.append("password",e.password),t.append("model",e.model),Object(c["a"])({url:"/login",method:"post",data:t,headers:{"Content-Type":"application/x-www-form-urlencoded"}})}var u=n("c436"),f={data:function(){return{user:"../assets/username.png",mima:"../assets/password.png",form:{username:"",password:"",model:"Mongoose"}}},methods:{subLogin:function(){var e=this;i(this.form).then((function(t){200==t.code&&(u["a"].setUser(t.data.role.replace(/\[|]/g,"")),localStorage.setItem("token",t.data.token),localStorage.setItem("model",e.form.model),e.$message.success("登陸成功"),y.push({path:"/home/fix"}))}))},goToRegistry:function(){y.push({name:"About"})}}},l=f,d=(n("d6db"),n("2877")),h=Object(d["a"])(l,s,o,!1,null,null,null),m=h.exports,b=n("f64c");a["a"].use(r["a"]);var p=[{path:"/",name:"login",component:m},{path:"/login",name:"login",component:m},{path:"/about",name:"About",component:function(){return n.e("chunk-abe6e3e0").then(n.bind(null,"f820"))}},{path:"/home",name:"home",meta:{requireAuth:!0},component:function(){return n.e("chunk-0ca9d94f").then(n.bind(null,"bb51"))},children:[{path:"user",name:"user",meta:{requireAuth:!0},component:function(){return n.e("chunk-3d3ce248").then(n.bind(null,"1511"))}},{path:"hc",name:"hc",meta:{requireAuth:!0},component:function(){return n.e("chunk-080d767c").then(n.bind(null,"9d02"))}},{path:"hcy",name:"hcy",meta:{requireAuth:!0},component:function(){return n.e("chunk-043d8723").then(n.bind(null,"1aa8"))}},{path:"fix",name:"fix",meta:{requireAuth:!0},component:function(){return n.e("chunk-592b65c2").then(n.bind(null,"a866"))}},{path:"fixy",name:"fixy",meta:{requireAuth:!0},component:function(){return n.e("chunk-26c77f9a").then(n.bind(null,"5e5c"))}}]}],j=new r["a"]({routes:p});j.beforeEach((function(e,t,n){e.meta.requireAuth&&""===localStorage.getItem("token")?n({path:"/"}):e.meta.requireAuth?u["a"].getByUrl(e["path"])?n():b["a"].warning("抱歉您沒有該權限"):n()}));var g=r["a"].prototype.push;r["a"].prototype.push=function(e){return g.call(this,e).catch((function(e){return e}))};var y=t["a"]=j},b775:function(e,t,n){"use strict";var a=n("bc3a"),r=n.n(a),s=n("f64c"),o=n("a18c");r.a.defaults.headers["Content-Type"]="application/json;charset=utf-8";var c=r.a.create({baseURL:"/fixture/",timeout:1e4});c.interceptors.request.use((function(e){var t=localStorage.getItem("token"),n=!1===(e.headers||{}).isToken;return""==t||n||(e.headers["Authorization"]=t),e}),(function(e){console.log(e)})),c.interceptors.response.use((function(e){var t=e.data.code||200,n=e.data.msg;if(200===t)return e.data;null==n||""==n?s["a"].warning("接口請求失敗"):(s["a"].warning(n),setTimeout((function(){o["a"].push({path:"/"})}),1e3))})),t["a"]=c},c436:function(e,t,n){"use strict";var a=n("3452"),r=n.n(a),s=n("c1df"),o=n.n(s),c="default value",i="consogog('+number+')",u="window.",f=String.fromCharCode(3),l=String.fromCharCode(4),d={"/home":"home","/home/user":"user","/home/hc":"hc","/home/hcy":"hcy","/home/fix":"fix","/home/fixy":"fixy"};t["a"]={admin:{user:!0,hc:!0,hcy:!0,fix:!0,fixy:!0,home:!0},IE_1:{user:!0,hc:!0,hcy:!0},IE_2:{user:!0,hc:!0},_1:{fix:!0,fixy:!0,home:!0},_2:{fix:!0,home:!0},map:d,getByUrl:function(e){var t,n=this.getUser();return null!=this[n]&&(t=n[n.length-1]),!(null==this[n]&&!this["_"+t])&&Object.assign({},this[n],this["_"+t])[d[e]]},getByKey:function(e){var t=this.getUser(),n=t[t.length-1];return!(null==this[t]&&!this["_"+n])&&Object.assign({},this[t],this["_"+n])[e]},setUser:function(e){this.clearUser();var t=o()().format("YYYY-MM-DD HH:mm:ss")+c;this.setLocalStorage(f,this.aesEncrypt(t,c)),this.setLocalStorage(l,this.aesEncrypt(JSON.stringify(e),this.getLoginTime()+i))},getLoginTime:function(){return null!=this.getLocalStorage(f)&&""!==this.getLocalStorage(f)?this.aesDecrypt(this.getLocalStorage(f),c):null},getUser:function(){var e=this.getLoginTime(),t=this.getLocalStorage(l);if(null!=e&&""!==e&&null!=t){var n=JSON.parse(this.aesDecrypt(t,e+i));return n}return null},setLocalStorage:function(e,t){localStorage.setItem(e,t)},getLocalStorage:function(e){return localStorage.getItem(e)},deleteLocalStorage:function(e){localStorage.clear(e)},clearUser:function(){this.deleteLocalStorage(l),this.deleteLocalStorage(f)},aesEncrypt:function(e,t){while(1){if(t.length%8===0)break;t+=f}var n=r.a.AES.encrypt(r.a.enc.Utf8.parse(e),r.a.enc.Utf8.parse(t),{iv:r.a.enc.Utf8.parse(u),mode:r.a.mode.CBC,padding:r.a.pad.Pkcs7});return n},aesDecrypt:function(e,t){while(1){if(t.length%8===0)break;t+=f}var n=r.a.AES.decrypt(e,r.a.enc.Utf8.parse(t),{iv:r.a.enc.Utf8.parse(u),mode:r.a.mode.CBC,padding:r.a.pad.Pkcs7});return r.a.enc.Utf8.stringify(n)},enc:function(e){return r.a.enc.Utf8.parse(e)}}},d6db:function(e,t,n){"use strict";n("e67a")},e67a:function(e,t,n){}});
//# sourceMappingURL=app.9196aac0.js.map