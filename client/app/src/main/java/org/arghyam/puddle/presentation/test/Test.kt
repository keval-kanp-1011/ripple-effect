package org.arghyam.puddle.presentation.test

import org.arghyam.puddle.R
import org.arghyam.puddle.data.dto.responses.water_ft_calculator.Coordinate
import org.arghyam.puddle.data.dto.responses.water_ft_calculator.CornerType
import org.arghyam.puddle.data.dto.responses.water_ft_calculator.IngredientRow2
import org.arghyam.puddle.data.dto.responses.water_ft_calculator.IngredientRowItem2

var rowOne = IngredientRow2(
    1, 1, listOf(
        IngredientRowItem2(
            itemId = 1,
            title = "Veggies",
            unit = "g",
            unselectedResId = R.drawable.vector_1v2,
            selectedResId = R.drawable.vector_1v2_b,
            sampleImage = R.drawable.ixd_vegetables,
            sampleImageSize = 70f,
            scaleFactor = 0.8f,
            xOffset = -80f,
            yOffset = 300f,
            cornerType = CornerType.LEFT,
            doneOffSet = Coordinate(x = 0, y = (-30)),
            incOffSet = Coordinate(x = 20, y = (0)),
            decOffSet = Coordinate(x = 0, y = (20))
        ),
        IngredientRowItem2(
            itemId = 2,
            title = "Chicken",
            unit = "g",
            unselectedResId = R.drawable.vector_2v1,
            selectedResId = R.drawable.vector_2v1_b,
            sampleImage = R.drawable.ixd_chicken,
            sampleImageSize = 90f,
            scaleFactor = 0.9f,
            xOffset = 250f,
            yOffset = 0f,
            cornerType = CornerType.CENTER,
            doneOffSet = Coordinate(x = 0, y = (-20)),
            incOffSet = Coordinate(x = 20, y = (10)),
            decOffSet = Coordinate(x = -10, y = (0))
        ),
        IngredientRowItem2(
            itemId = 3,
            title = "Apple",
            unit = "g",
            unselectedResId = R.drawable.vector_6v3,
            selectedResId = R.drawable.vector_6v3_b,
            sampleImage = R.drawable.ixd_apple,
            sampleImageSize = 50f,
            scaleFactor = 0.95f,
            xOffset = 800f,
            yOffset = 280f,
            cornerType = CornerType.RIGHT,
            doneOffSet = Coordinate(x = 0, y = (-30)),
            incOffSet = Coordinate(x = -20, y = 0),
            decOffSet = Coordinate(x = 0, y = (20))
        ),

        )
)

var rowTwo = IngredientRow2(
    2, 2, listOf(
        IngredientRowItem2(
            itemId = 1,
            title = "Wheat",
            unit = "g",
            unselectedResId = R.drawable.vector_3v4,
            selectedResId = R.drawable.vector_3v4_b,
            sampleImage = R.drawable.ixd_wheat,
            sampleImageSize = 120f,
            scaleFactor = 0.9f,
            xOffset = -150f,
            yOffset = 180f,
            cornerType = CornerType.LEFT,
            doneOffSet = Coordinate(x = 0, y = (-30)),
            incOffSet = Coordinate(x = 30, y = 0),
            decOffSet = Coordinate(x = 0, y = (20))
        ),
        IngredientRowItem2(
            itemId = 2,
            title = "Rice",
            unit = "g",
            unselectedResId = R.drawable.vector_4v5,
            selectedResId = R.drawable.vector_4v5_b,
            sampleImage = R.drawable.ixd_rice,
            sampleImageSize = 90f,
            scaleFactor = 0.95f,
            xOffset = 540f,
            yOffset = 120f,
            cornerType = CornerType.RIGHT,
            doneOffSet = Coordinate(x = 0, y = (-30)),
            incOffSet = Coordinate(x = -20, y = 0),
            decOffSet = Coordinate(x = 0, y = (20))
        ),
        IngredientRowItem2(
            itemId = 3,
            title = "Onion",
            unit = "g",
            unselectedResId = R.drawable.vector_5v6,
            selectedResId = R.drawable.vector_5v6_b,
            sampleImage = R.drawable.ixd_onion,
            sampleImageSize = 50f,
            scaleFactor = 0.8f,
            xOffset = 480f,
            yOffset = 420f,
            cornerType = CornerType.CENTER,
            doneOffSet = Coordinate(x = 0, y = (-20)),
            incOffSet = Coordinate(x = 20, y = 0),
            decOffSet = Coordinate(x = -20, y = 0)
        ),
        IngredientRowItem2(
            itemId = 4,
            title = "Milk",
            unit = "l",
            unselectedResId = R.drawable.vector_7v7,
            selectedResId = R.drawable.vector_7v7_b,
            sampleImage = R.drawable.ixd_milk,
            sampleImageSize = 60f,
            scaleFactor = 0.8f,
            xOffset = 760f,
            yOffset = 580f,
            cornerType = CornerType.RIGHT,
            doneOffSet = Coordinate(x = 0, y = (-20)),
            incOffSet = Coordinate(x = -20, y = 0),
            decOffSet = Coordinate(x = 0, y = (20))
        ),
        IngredientRowItem2(
            itemId = 5,
            title = "Orange",
            unit = "g",
            unselectedResId = R.drawable.vector_9v8,
            selectedResId = R.drawable.vector_9v8_b,
            sampleImage = R.drawable.ixd_orange,
            sampleImageSize = 50f,
            scaleFactor = 1f,
            xOffset = 0f,
            yOffset = 820f,
            cornerType = CornerType.LEFT,
            doneOffSet = Coordinate(x = 0, y = (-30)),
            incOffSet = Coordinate(x = 30, y = 0),
            decOffSet = Coordinate(x = 0, y = (30))
        ),
        IngredientRowItem2(
            itemId = 6,
            title = "Tea",
            unit = "l",
            unselectedResId = R.drawable.vector_11v9,
            selectedResId = R.drawable.vector_11v9_b,
            sampleImage = R.drawable.ixd_tea,
            sampleImageSize = 80f,
            scaleFactor = 0.9f,
            xOffset = 350f,
            yOffset = 780f,
            cornerType = CornerType.CENTER,
            doneOffSet = Coordinate(x = 0, y = (-20)),
            incOffSet = Coordinate(x = 20, y = 0),
            decOffSet = Coordinate(x = -20, y = 0)
        ),
        IngredientRowItem2(
            itemId = 7,
            title = "Lemon",
            unit = "l",
            unselectedResId = R.drawable.vector_14v10,
            selectedResId = R.drawable.vector_14v10_b,
            sampleImage = R.drawable.ixd_lemon,
            sampleImageSize = 80f,
            scaleFactor = 1f,
            xOffset = 80f,
            yOffset = 1160f,
            cornerType = CornerType.LEFT,
            doneOffSet = Coordinate(x = 0, y = (-30)),
            incOffSet = Coordinate(x = 30, y = 0),
            decOffSet = Coordinate(x = 0, y = (30))
        ),
        IngredientRowItem2(
            itemId = 8,
            title = "Coffee",
            unit = "l",
            unselectedResId = R.drawable.vector_12v11,
            selectedResId = R.drawable.vector_12v11_b,
            sampleImage = R.drawable.ixd_coffee,
            sampleImageSize = 80f,
            scaleFactor = 0.8f,
            xOffset = 650f,
            yOffset = 950f,
            cornerType = CornerType.RIGHT,
            doneOffSet = Coordinate(x = 0, y = (-20)),
            incOffSet = Coordinate(x = -20, y = 0),
            decOffSet = Coordinate(x = 0, y = (10))
        ),

        )
)

var rowThree = IngredientRow2(
    3, 3, listOf(
        IngredientRowItem2(
            itemId = 1,
            title = "Pork",
            unit = "g",
            unselectedResId = R.drawable.vector_13v12,
            selectedResId = R.drawable.vector_13v12_b__1_,
            sampleImage = R.drawable.ixd_pork,
            sampleImageSize = 150f,
            scaleFactor = 0.9f,
            xOffset = -50f,
            yOffset = 0f,
            cornerType = CornerType.LEFT,
            doneOffSet = Coordinate(x = 0, y = (-20)),
            incOffSet = Coordinate(x = -20, y = 0),
            decOffSet = Coordinate(x = 0, y = (10))
        ),
        IngredientRowItem2(
            itemId = 2,
            title = "Tomato",
            unit = "g",
            unselectedResId = R.drawable.vector_16v13,
            selectedResId = R.drawable.vector_16v13_b,
            sampleImage = R.drawable.ixd_tomato,
            sampleImageSize = 60f,
            scaleFactor = 0.9f,
            xOffset = 700f,
            yOffset = 0f,
            cornerType = CornerType.RIGHT,
            doneOffSet = Coordinate(x = 0, y = (-20)),
            incOffSet = Coordinate(x = -20, y = 0),
            decOffSet = Coordinate(x = 0, y = (10))
        ),
        IngredientRowItem2(
            itemId = 3,
            title = "Potato",
            unit = "g",
            unselectedResId = R.drawable.vector_14v10,
            selectedResId = R.drawable.vector_14v10_b,
            sampleImage = R.drawable.ixd_potato,
            sampleImageSize = 50f,
            scaleFactor = 1f,
            xOffset = -90f,
            yOffset = 700f,
            cornerType = CornerType.LEFT,
            doneOffSet = Coordinate(x = 0, y = (-20)),
            incOffSet = Coordinate(x = -20, y = 0),
            decOffSet = Coordinate(x = 0, y = (10))
        ),
        IngredientRowItem2(
            itemId = 4,
            title = "Cheese",
            unit = "g",
            unselectedResId = R.drawable.vector_15v15,
            selectedResId = R.drawable.vector_15v15_b,
            sampleImage = R.drawable.ixd_cheese,
            sampleImageSize = 90f,
            scaleFactor = 0.9f,
            xOffset = 460f,
            yOffset = 400f,
            cornerType = CornerType.RIGHT,
            doneOffSet = Coordinate(x = 0, y = (-20)),
            incOffSet = Coordinate(x = -20, y = 0),
            decOffSet = Coordinate(x = 0, y = (10))
        ),
        IngredientRowItem2(
            itemId = 5,
            title = "Pulses",
            unit = "g",
            unselectedResId = R.drawable.vector_19v16,
            selectedResId = R.drawable.vector_19v16_b,
            sampleImage = R.drawable.ixd_pulses,
            sampleImageSize = 80f,
            scaleFactor = 1f,
            xOffset = 0f,
            yOffset = 1100f,
            cornerType = CornerType.LEFT,
            doneOffSet = Coordinate(x = 0, y = (-20)),
            incOffSet = Coordinate(x = -20, y = 0),
            decOffSet = Coordinate(x = 0, y = (10))
        ),
        IngredientRowItem2(
            itemId = 6,
            title = "Butter",
            unit = "g",
            unselectedResId = R.drawable.vector_18v17,
            selectedResId = R.drawable.vector_18v17_b,
            sampleImage = R.drawable.ixd_butter,
            sampleImageSize = 60f,
            scaleFactor = 1f,
            xOffset = 600f,
            yOffset = 1000f,
            cornerType = CornerType.RIGHT,
            doneOffSet = Coordinate(x = 0, y = (-20)),
            incOffSet = Coordinate(x = -20, y = 0),
            decOffSet = Coordinate(x = 0, y = (10))
        ),
        IngredientRowItem2(
            itemId = 7,
            title = "Beer",
            unit = "l",
            unselectedResId = R.drawable.vector_16v18,
            selectedResId = R.drawable.vector_16v18_b,
            sampleImage = R.drawable.ixd_beer,
            sampleImageSize = 50f,
            scaleFactor = 0.9f,
            xOffset = 300f,
            yOffset = 1500f,
            cornerType = CornerType.CENTER,
            doneOffSet = Coordinate(x = 0, y = (-20)),
            incOffSet = Coordinate(x = -20, y = 0),
            decOffSet = Coordinate(x = 0, y = (10))
        ),
        IngredientRowItem2(
            itemId = 8,
            title = "Banana",
            unit = "g",
            unselectedResId = R.drawable.vector_21v19,
            selectedResId = R.drawable.vector_21v19_b,
            sampleImage = R.drawable.ixd_banana,
            sampleImageSize = 60f,
            scaleFactor = 1f,
            xOffset = 750f,
            yOffset = 1500f,
            cornerType = CornerType.RIGHT,
            doneOffSet = Coordinate(x = 0, y = (-20)),
            incOffSet = Coordinate(x = -20, y = 0),
            decOffSet = Coordinate(x = 0, y = (10))
        ),
        IngredientRowItem2(
            itemId = 9,
            title = "Nuts",
            unit = "g",
            unselectedResId = R.drawable.vector_20v20__1_,
            selectedResId = R.drawable.vector_20v20_b__1_,
            sampleImage = R.drawable.ixd_nuts,
            sampleImageSize = 100f,
            scaleFactor = 1f,
            xOffset = -80f,
            yOffset = 1700f,
            cornerType = CornerType.LEFT,
            doneOffSet = Coordinate(x = 0, y = (-20)),
            incOffSet = Coordinate(x = -20, y = 0),
            decOffSet = Coordinate(x = 0, y = (10))
        ),
        IngredientRowItem2(
            itemId = 10,
            title = "Sugar",
            unit = "g",
            unselectedResId = R.drawable.vector_23v22,
            selectedResId = R.drawable.vector_23v22_b,
            sampleImage = R.drawable.ixd_sugar,
            sampleImageSize = 80f,
            scaleFactor = 1f,
            xOffset = -200f,
            yOffset = 2420f,
            cornerType = CornerType.LEFT,
            doneOffSet = Coordinate(x = 0, y = (-20)),
            incOffSet = Coordinate(x = -20, y = 0),
            decOffSet = Coordinate(x = 0, y = (10))
        ),
        IngredientRowItem2(
            itemId = 11,
            title = "Chocolate",
            unit = "g",
            unselectedResId = R.drawable.vector_17v21,
            selectedResId = R.drawable.vector_17v21_b,
            sampleImage = R.drawable.ixd_chocolate,
            sampleImageSize = 100f,
            scaleFactor = 0.9f,
            xOffset = 500f,
            yOffset = 1900f,
            cornerType = CornerType.RIGHT,
            doneOffSet = Coordinate(x = 0, y = (-20)),
            incOffSet = Coordinate(x = -20, y = 0),
            decOffSet = Coordinate(x = 0, y = (10))
        ),

        )
)