
class BinarySearchTree<T : Comparable<T>>{
    class Node<T>(var value : T){
        var left :Node<T>? = null
        var right :Node<T>? = null
    }

    var head :Node<T>? = null


    fun add(arg:T){
        if(head == null){
            head = Node(arg)
        }else{
            var newNode = Node(arg)
            var travel = head
            var travelHead :Node<T>? = null
            while(travel != null){
                travelHead = travel
                if(arg < travel.value){
                    travel = travel.left
                }else{
                    travel = travel.right
                }
            }
            if(travelHead == null){
                travelHead = newNode
            }else if (arg < travelHead.value){
                travelHead.left = newNode
            }else{
                travelHead.right = newNode
            }

        }
    }

    fun printTree(startNode:Node<T>? = head){
        if(startNode != null){
            printTree(startNode.left)
            print(startNode.value.toString())
            print("\n")
            printTree(startNode.right)
        }
    }
}



fun main(){
    var tree = BinarySearchTree<Int>()

    tree.add(5)
    tree.add(10)
    tree.add(16)
    tree.add(1)

    tree.printTree()
}