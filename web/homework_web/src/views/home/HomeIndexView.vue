<template>
    <div>
        <div class="welcome">
               welcome!
       </div>


    <!-- <div class="row">
        <div class="col-4">
            <div class="card">
                <div class="card-body">
                    <h5 class="card-title" style="align-items: center;">游戏规则</h5>
                    <p class="card-text">With supporting text below as a natural lead-in to additional content.</p>
                    <a href="#" class="btn btn-primary">Go somewhere</a>
                </div>
            </div>
        </div>
    </div> -->
    <div class="col-4">
        <div class="rules">
            <div class="Title" style="text-align: center; font-size: 40px; color: #395374;">游戏规则</div>
            <div class="Content">vfvfdvfdb </div>
        </div>


        <div class="BeginGame" >
            <router-link  type="button" class="btn btn-warning btn-lg" :to="{name:'pk_index'}">进入游戏</router-link>
            <!-- <buttont type="button" class="btn btn-outline-secondary" onclick="window.location.href = 'http://localhost:8080/pk/'" >进入游戏</buttont> -->
        </div>


    </div>
   
    

    </div>
    
       

    
    

    <!-- <div class="col-2" align = "center">
        <div class = "dice"></div>
    </div> -->
    


</template>

<script>
// import ContenFiled from '../../components/ContentFiled.vue'
export default{
    components:{
    // ContenFiled
}
}
</script>

<style scoped>
/* body{
    display: flex;
    justify-content: center;
    align-items: center;
    min-height: 100vh;
}

.dice{
    background-image: url("@/assets/images/dice.png");
    width: 100px;
    height: 100px;
    background-position: 0% 50%;
    border-radius:20%;
    animation: .2s steps(6, jump-none) random infinite;
    margin-top: 20vh;
}

@keyframes random{
    to{
        background-position: 100% 50%;
    }
} */

div.welcome{
    margin-top: 20px;
    text-align: center;
    font-size: 100px;
    font-weight: bold;
    color: #fda7a6;
    font-family: Verdana, Geneva, Tahoma, sans-serif;
}
/* div.card{
    margin-left: 70px;
    margin-top:60px;
    background: #F8ECDB;
} */
div.rules{
    border: 0.5rem outset pink;
    border-radius: 12px;
    font: bold 1rem sans-serif;
    margin: 2rem;
    padding: 1rem;
    outline-offset: 0.5rem;
  }
div.BeginGame{
    margin-left: 40%;
}

</style>