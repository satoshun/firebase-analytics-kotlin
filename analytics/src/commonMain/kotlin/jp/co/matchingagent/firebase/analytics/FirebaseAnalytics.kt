package jp.co.matchingagent.firebase.analytics

import jp.co.matchingagent.firebase.Firebase

expect val Firebase.analytics: FirebaseAnalytics

expect class FirebaseAnalytics {
  fun logEvent(name: String)

  fun logEvent(
    name: String,
    block: FirebaseParametersBuilder.() -> Unit
  )

  fun setAnalyticsCollectionEnabled(enabled: Boolean)

  fun setUserId(id: String?)

  fun setSessionTimeoutDuration(milliseconds: Long)

  suspend fun getAppInstanceId(): String

  fun resetAnalyticsData()

  fun setUserProperty(name: String, value: String)

  object Event {
    val AD_IMPRESSION: String
    val ADD_PAYMENT_INFO: String
    val ADD_TO_CART: String
    val ADD_TO_WISHLIST: String
    val APP_OPEN: String
    val BEGIN_CHECKOUT: String
    val CAMPAIGN_DETAILS: String
    val ECOMMERCE_PURCHASE: String
    val GENERATE_LEAD: String
    val JOIN_GROUP: String
    val LEVEL_END: String
    val LEVEL_START: String
    val LEVEL_UP: String
    val LOGIN: String
    val POST_SCORE: String
    val PRESENT_OFFER: String
    val PURCHASE_REFUND: String
    val SEARCH: String
    val SELECT_CONTENT: String
    val SHARE: String
    val SIGN_UP: String
    val SPEND_VIRTUAL_CURRENCY: String
    val TUTORIAL_BEGIN: String
    val TUTORIAL_COMPLETE: String
    val UNLOCK_ACHIEVEMENT: String
    val VIEW_ITEM: String
    val VIEW_ITEM_LIST: String
    val VIEW_SEARCH_RESULTS: String
    val EARN_VIRTUAL_CURRENCY: String
    val SCREEN_VIEW: String
    val REMOVE_FROM_CART: String
    val CHECKOUT_PROGRESS: String
    val SET_CHECKOUT_OPTION: String
    val ADD_SHIPPING_INFO: String
    val PURCHASE: String
    val REFUND: String
    val SELECT_ITEM: String
    val SELECT_PROMOTION: String
    val VIEW_CART: String
    val VIEW_PROMOTION: String
  }

  object Param {
    val ACHIEVEMENT_ID: String
    val AD_FORMAT: String
    val AD_PLATFORM: String
    val AD_SOURCE: String
    val AD_UNIT_NAME: String
    val CHARACTER: String
    val TRAVEL_CLASS: String
    val CONTENT_TYPE: String
    val CURRENCY: String
    val COUPON: String
    val START_DATE: String
    val END_DATE: String
    val EXTEND_SESSION: String
    val FLIGHT_NUMBER: String
    val GROUP_ID: String
    val ITEM_CATEGORY: String
    val ITEM_ID: String
    val ITEM_LOCATION_ID: String
    val ITEM_NAME: String
    val LOCATION: String
    val LEVEL: String
    val LEVEL_NAME: String
    val SIGN_UP_METHOD: String
    val METHOD: String
    val NUMBER_OF_NIGHTS: String
    val NUMBER_OF_PASSENGERS: String
    val NUMBER_OF_ROOMS: String
    val DESTINATION: String
    val ORIGIN: String
    val PRICE: String
    val QUANTITY: String
    val SCORE: String
    val SHIPPING: String
    val TRANSACTION_ID: String
    val SEARCH_TERM: String
    val SUCCESS: String
    val TAX: String
    val VALUE: String
    val VIRTUAL_CURRENCY_NAME: String
    val CAMPAIGN: String
    val SOURCE: String
    val MEDIUM: String
    val TERM: String
    val CONTENT: String
    val ACLID: String
    val CP1: String
    val ITEM_BRAND: String
    val ITEM_VARIANT: String
    val ITEM_LIST: String
    val CHECKOUT_STEP: String
    val CHECKOUT_OPTION: String
    val CREATIVE_NAME: String
    val CREATIVE_SLOT: String
    val AFFILIATION: String
    val INDEX: String
    val DISCOUNT: String
    val ITEM_CATEGORY2: String
    val ITEM_CATEGORY3: String
    val ITEM_CATEGORY4: String
    val ITEM_CATEGORY5: String
    val ITEM_LIST_ID: String
    val ITEM_LIST_NAME: String
    val ITEMS: String
    val LOCATION_ID: String
    val PAYMENT_TYPE: String
    val PROMOTION_ID: String
    val PROMOTION_NAME: String
    val SCREEN_CLASS: String
    val SCREEN_NAME: String
    val SHIPPING_TIER: String
  }
}

expect class FirebaseParametersBuilder {
  fun param(key: String, value: Double)
  fun param(key: String, value: Long)
  fun param(key: String, value: String)
}
