#设计说明
用markdown语法以文字说明所写代码中用到哪些面向对象的概念、机制、设计理念等，并阐述这样做的好处。
---
1.首先我选择定义最基本的单位，也就是生物，生物的种类是确定的，所以我用了*enum*类，并给生物一些基本属性.这就是**Creature类**.
2.生物和对峙局面的形成需要地图，所以有了**Map类**.
3.然后我考虑到这个对峙局面中有两个阵营，并且只有两个阵营，这两个阵营是确定的，其中的生物种类是确定的，不会出现第三个阵营，每个阵营中也不会出现其他阵营的生物，所以我进一步限定每个阵营有7个生物（因为如果不限定，以目前对java的掌握程度，有一些问题解决不了），用*emum*类去定义这两个阵营，将每个阵营中的生物明确下来，这就是**Fraction类**.**Fraction类**中包含一个**Map类**的对象，并且是*static*的，因为两个阵营共用这张地图，在同一张地图上布阵，变阵.在main函数里面只要定义完两个阵营，所有的一切就都定下来了.
4.别的也没有什么了，就是一些操作和打印。
end
---
