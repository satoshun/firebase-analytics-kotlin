package jp.co.matchingagent.firebase.analytics.analytics

import com.google.firebase.analytics.ktx.analytics
import com.google.firebase.analytics.ktx.logEvent
import com.google.firebase.ktx.Firebase

actual class FirebaseAnalytics {
  actual fun logEvent(
    name: String,
    block: FirebaseParametersBuilder.() -> Unit
  ) {
    Firebase.analytics.logEvent(name, block)
  }
}

actual object FirebaseAnalyticsParam {
  actual val ACHIEVEMENT_ID: String
    get() = com.google.firebase.analytics.FirebaseAnalytics.Param.ACHIEVEMENT_ID

  actual val AD_FORMAT: String
    get() = com.google.firebase.analytics.FirebaseAnalytics.Param.AD_FORMAT

  actual val AD_PLATFORM: String
    get() = com.google.firebase.analytics.FirebaseAnalytics.Param.AD_PLATFORM

  actual val AD_SOURCE: String
    get() = com.google.firebase.analytics.FirebaseAnalytics.Param.AD_SOURCE

  actual val AD_UNIT_NAME: String
    get() = com.google.firebase.analytics.FirebaseAnalytics.Param.AD_UNIT_NAME

  actual val CHARACTER: String
    get() = com.google.firebase.analytics.FirebaseAnalytics.Param.CHARACTER

  actual val TRAVEL_CLASS: String
    get() = com.google.firebase.analytics.FirebaseAnalytics.Param.TRAVEL_CLASS

  actual val CONTENT_TYPE: String
    get() = com.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT_TYPE

  actual val CURRENCY: String
    get() = com.google.firebase.analytics.FirebaseAnalytics.Param.CURRENCY

  actual val COUPON: String
    get() = com.google.firebase.analytics.FirebaseAnalytics.Param.COUPON

  actual val START_DATE: String
    get() = com.google.firebase.analytics.FirebaseAnalytics.Param.START_DATE

  actual val END_DATE: String
    get() = com.google.firebase.analytics.FirebaseAnalytics.Param.END_DATE

  actual val EXTEND_SESSION: String
    get() = com.google.firebase.analytics.FirebaseAnalytics.Param.EXTEND_SESSION

  actual val FLIGHT_NUMBER: String
    get() = com.google.firebase.analytics.FirebaseAnalytics.Param.FLIGHT_NUMBER

  actual val GROUP_ID: String
    get() = com.google.firebase.analytics.FirebaseAnalytics.Param.GROUP_ID

  actual val ITEM_CATEGORY: String
    get() = com.google.firebase.analytics.FirebaseAnalytics.Param.ITEM_CATEGORY

  actual val ITEM_ID: String
    get() = com.google.firebase.analytics.FirebaseAnalytics.Param.ITEM_ID

  actual val ITEM_LOCATION_ID: String
    get() = com.google.firebase.analytics.FirebaseAnalytics.Param.ITEM_LOCATION_ID

  actual val ITEM_NAME: String
    get() = com.google.firebase.analytics.FirebaseAnalytics.Param.ITEM_NAME

  actual val LOCATION: String
    get() = com.google.firebase.analytics.FirebaseAnalytics.Param.LOCATION

  actual val LEVEL: String
    get() = com.google.firebase.analytics.FirebaseAnalytics.Param.LEVEL

  actual val LEVEL_NAME: String
    get() = com.google.firebase.analytics.FirebaseAnalytics.Param.LEVEL_NAME

  actual val SIGN_UP_METHOD: String
    get() = com.google.firebase.analytics.FirebaseAnalytics.Param.SIGN_UP_METHOD

  actual val METHOD: String
    get() = com.google.firebase.analytics.FirebaseAnalytics.Param.METHOD

  actual val NUMBER_OF_NIGHTS: String
    get() = com.google.firebase.analytics.FirebaseAnalytics.Param.NUMBER_OF_NIGHTS

  actual val NUMBER_OF_PASSENGERS: String
    get() = com.google.firebase.analytics.FirebaseAnalytics.Param.NUMBER_OF_PASSENGERS

  actual val NUMBER_OF_ROOMS: String
    get() = com.google.firebase.analytics.FirebaseAnalytics.Param.NUMBER_OF_ROOMS

  actual val DESTINATION: String
    get() = com.google.firebase.analytics.FirebaseAnalytics.Param.DESTINATION

  actual val ORIGIN: String
    get() = com.google.firebase.analytics.FirebaseAnalytics.Param.ORIGIN

  actual val PRICE: String
    get() = com.google.firebase.analytics.FirebaseAnalytics.Param.PRICE

  actual val QUANTITY: String
    get() = com.google.firebase.analytics.FirebaseAnalytics.Param.QUANTITY

  actual val SCORE: String
    get() = com.google.firebase.analytics.FirebaseAnalytics.Param.SCORE

  actual val SHIPPING: String
    get() = com.google.firebase.analytics.FirebaseAnalytics.Param.SHIPPING

  actual val TRANSACTION_ID: String
    get() = com.google.firebase.analytics.FirebaseAnalytics.Param.TRANSACTION_ID

  actual val SEARCH_TERM: String
    get() = com.google.firebase.analytics.FirebaseAnalytics.Param.SEARCH_TERM

  actual val SUCCESS: String
    get() = com.google.firebase.analytics.FirebaseAnalytics.Param.SUCCESS

  actual val TAX: String
    get() = com.google.firebase.analytics.FirebaseAnalytics.Param.TAX

  actual val VALUE: String
    get() = com.google.firebase.analytics.FirebaseAnalytics.Param.VALUE

  actual val VIRTUAL_CURRENCY_NAME: String
    get() = com.google.firebase.analytics.FirebaseAnalytics.Param.VIRTUAL_CURRENCY_NAME

  actual val CAMPAIGN: String
    get() = com.google.firebase.analytics.FirebaseAnalytics.Param.CAMPAIGN

  actual val SOURCE: String
    get() = com.google.firebase.analytics.FirebaseAnalytics.Param.SOURCE

  actual val MEDIUM: String
    get() = com.google.firebase.analytics.FirebaseAnalytics.Param.MEDIUM

  actual val TERM: String
    get() = com.google.firebase.analytics.FirebaseAnalytics.Param.TERM

  actual val CONTENT: String
    get() = com.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT

  actual val ACLID: String
    get() = com.google.firebase.analytics.FirebaseAnalytics.Param.ACLID

  actual val CP1: String
    get() = com.google.firebase.analytics.FirebaseAnalytics.Param.CP1

  actual val ITEM_BRAND: String
    get() = com.google.firebase.analytics.FirebaseAnalytics.Param.ITEM_BRAND

  actual val ITEM_VARIANT: String
    get() = com.google.firebase.analytics.FirebaseAnalytics.Param.ITEM_VARIANT

  actual val ITEM_LIST: String
    get() = com.google.firebase.analytics.FirebaseAnalytics.Param.ITEM_LIST

  actual val CHECKOUT_STEP: String
    get() = com.google.firebase.analytics.FirebaseAnalytics.Param.CHECKOUT_STEP

  actual val CHECKOUT_OPTION: String
    get() = com.google.firebase.analytics.FirebaseAnalytics.Param.CHECKOUT_OPTION

  actual val CREATIVE_NAME: String
    get() = com.google.firebase.analytics.FirebaseAnalytics.Param.CREATIVE_NAME

  actual val CREATIVE_SLOT: String
    get() = com.google.firebase.analytics.FirebaseAnalytics.Param.CREATIVE_SLOT

  actual val AFFILIATION: String
    get() = com.google.firebase.analytics.FirebaseAnalytics.Param.AFFILIATION

  actual val INDEX: String
    get() = com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX

  actual val DISCOUNT: String
    get() = com.google.firebase.analytics.FirebaseAnalytics.Param.DISCOUNT

  actual val ITEM_CATEGORY2: String
    get() = com.google.firebase.analytics.FirebaseAnalytics.Param.ITEM_CATEGORY2

  actual val ITEM_CATEGORY3: String
    get() = com.google.firebase.analytics.FirebaseAnalytics.Param.ITEM_CATEGORY3

  actual val ITEM_CATEGORY4: String
    get() = com.google.firebase.analytics.FirebaseAnalytics.Param.ITEM_CATEGORY4

  actual val ITEM_CATEGORY5: String
    get() = com.google.firebase.analytics.FirebaseAnalytics.Param.ITEM_CATEGORY5

  actual val ITEM_LIST_ID: String
    get() = com.google.firebase.analytics.FirebaseAnalytics.Param.ITEM_LIST_ID

  actual val ITEM_LIST_NAME: String
    get() = com.google.firebase.analytics.FirebaseAnalytics.Param.ITEM_LIST_NAME

  actual val ITEMS: String
    get() = com.google.firebase.analytics.FirebaseAnalytics.Param.ITEMS

  actual val LOCATION_ID: String
    get() = com.google.firebase.analytics.FirebaseAnalytics.Param.LOCATION_ID

  actual val PAYMENT_TYPE: String
    get() = com.google.firebase.analytics.FirebaseAnalytics.Param.PAYMENT_TYPE

  actual val PROMOTION_ID: String
    get() = com.google.firebase.analytics.FirebaseAnalytics.Param.PROMOTION_ID

  actual val PROMOTION_NAME: String
    get() = com.google.firebase.analytics.FirebaseAnalytics.Param.PROMOTION_NAME

  actual val SCREEN_CLASS: String
    get() = com.google.firebase.analytics.FirebaseAnalytics.Param.SCREEN_CLASS

  actual val SCREEN_NAME: String
    get() = com.google.firebase.analytics.FirebaseAnalytics.Param.SCREEN_NAME

  actual val SHIPPING_TIER: String
    get() = com.google.firebase.analytics.FirebaseAnalytics.Param.SHIPPING_TIER
}

actual typealias FirebaseParametersBuilder = com.google.firebase.analytics.ktx.ParametersBuilder
