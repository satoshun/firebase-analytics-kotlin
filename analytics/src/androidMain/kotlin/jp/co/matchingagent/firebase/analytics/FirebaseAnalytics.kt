package jp.co.matchingagent.firebase.analytics

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import com.google.firebase.analytics.FirebaseAnalytics.ConsentStatus
import com.google.firebase.analytics.FirebaseAnalytics.ConsentType
import com.google.firebase.analytics.ktx.analytics
import com.google.firebase.analytics.ktx.logEvent
import jp.co.matchingagent.firebase.Firebase
import kotlinx.coroutines.tasks.await
import com.google.firebase.analytics.FirebaseAnalytics as faFirebaseAnalytics
import com.google.firebase.ktx.Firebase as faFirebase

actual val Firebase.analytics: FirebaseAnalytics
  get() = FirebaseAnalytics(faFirebase.analytics)

@SuppressLint("MissingPermission")
fun Firebase.analytics(context: Context): FirebaseAnalytics =
  FirebaseAnalytics(faFirebaseAnalytics.getInstance(context))

actual class FirebaseAnalytics(
  private val analytics: faFirebaseAnalytics
) {
  actual fun logEvent(name: String) {
    logEvent(name, null)
  }

  actual fun logEvent(
    name: String,
    block: FirebaseParametersBuilder.() -> Unit
  ) {
    analytics.logEvent(name, block)
  }

  actual fun setAnalyticsCollectionEnabled(enabled: Boolean) {
    analytics.setAnalyticsCollectionEnabled(enabled)
  }

  actual fun setUserId(id: String?) {
    analytics.setUserId(id)
  }

  actual fun setSessionTimeoutDuration(milliseconds: Long) {
    analytics.setSessionTimeoutDuration(milliseconds)
  }

  actual suspend fun getAppInstanceId(): String {
    return analytics.appInstanceId.await()
  }

  actual fun resetAnalyticsData() {
    analytics.resetAnalyticsData()
  }

  actual fun setUserProperty(name: String, value: String) {
    analytics.setUserProperty(name, value)
  }

  fun logEvent(name: String, parameters: Bundle?) {
    analytics.logEvent(name, parameters)
  }

  fun setDefaultEventParameters(parameters: Bundle?) {
    analytics.setDefaultEventParameters(parameters)
  }

  fun getFirebaseInstanceId(): String {
    return analytics.firebaseInstanceId
  }

  fun setConsent(consentSettings: Map<ConsentType, ConsentStatus>) {
    analytics.setConsent(consentSettings)
  }

  actual object Event {
    actual val AD_IMPRESSION: String get() = com.google.firebase.analytics.FirebaseAnalytics.Event.AD_IMPRESSION
    actual val ADD_PAYMENT_INFO: String get() = com.google.firebase.analytics.FirebaseAnalytics.Event.ADD_PAYMENT_INFO
    actual val ADD_TO_CART: String get() = com.google.firebase.analytics.FirebaseAnalytics.Event.ADD_TO_CART
    actual val ADD_TO_WISHLIST: String get() = com.google.firebase.analytics.FirebaseAnalytics.Event.ADD_TO_WISHLIST
    actual val APP_OPEN: String get() = com.google.firebase.analytics.FirebaseAnalytics.Event.APP_OPEN
    actual val BEGIN_CHECKOUT: String get() = com.google.firebase.analytics.FirebaseAnalytics.Event.BEGIN_CHECKOUT
    actual val CAMPAIGN_DETAILS: String get() = com.google.firebase.analytics.FirebaseAnalytics.Event.CAMPAIGN_DETAILS
    actual val ECOMMERCE_PURCHASE: String get() = com.google.firebase.analytics.FirebaseAnalytics.Event.ECOMMERCE_PURCHASE
    actual val GENERATE_LEAD: String get() = com.google.firebase.analytics.FirebaseAnalytics.Event.GENERATE_LEAD
    actual val JOIN_GROUP: String get() = com.google.firebase.analytics.FirebaseAnalytics.Event.JOIN_GROUP
    actual val LEVEL_END: String get() = com.google.firebase.analytics.FirebaseAnalytics.Event.LEVEL_END
    actual val LEVEL_START: String get() = com.google.firebase.analytics.FirebaseAnalytics.Event.LEVEL_START
    actual val LEVEL_UP: String get() = com.google.firebase.analytics.FirebaseAnalytics.Event.LEVEL_UP
    actual val LOGIN: String get() = com.google.firebase.analytics.FirebaseAnalytics.Event.LOGIN
    actual val POST_SCORE: String get() = com.google.firebase.analytics.FirebaseAnalytics.Event.POST_SCORE
    actual val PRESENT_OFFER: String get() = com.google.firebase.analytics.FirebaseAnalytics.Event.PRESENT_OFFER
    actual val PURCHASE_REFUND: String get() = com.google.firebase.analytics.FirebaseAnalytics.Event.PURCHASE_REFUND
    actual val SEARCH: String get() = com.google.firebase.analytics.FirebaseAnalytics.Event.SEARCH
    actual val SELECT_CONTENT: String get() = com.google.firebase.analytics.FirebaseAnalytics.Event.SELECT_CONTENT
    actual val SHARE: String get() = com.google.firebase.analytics.FirebaseAnalytics.Event.SHARE
    actual val SIGN_UP: String get() = com.google.firebase.analytics.FirebaseAnalytics.Event.SIGN_UP
    actual val SPEND_VIRTUAL_CURRENCY: String get() = com.google.firebase.analytics.FirebaseAnalytics.Event.SPEND_VIRTUAL_CURRENCY
    actual val TUTORIAL_BEGIN: String get() = com.google.firebase.analytics.FirebaseAnalytics.Event.TUTORIAL_BEGIN
    actual val TUTORIAL_COMPLETE: String get() = com.google.firebase.analytics.FirebaseAnalytics.Event.TUTORIAL_COMPLETE
    actual val UNLOCK_ACHIEVEMENT: String get() = com.google.firebase.analytics.FirebaseAnalytics.Event.UNLOCK_ACHIEVEMENT
    actual val VIEW_ITEM: String get() = com.google.firebase.analytics.FirebaseAnalytics.Event.VIEW_ITEM
    actual val VIEW_ITEM_LIST: String get() = com.google.firebase.analytics.FirebaseAnalytics.Event.VIEW_ITEM_LIST
    actual val VIEW_SEARCH_RESULTS: String get() = com.google.firebase.analytics.FirebaseAnalytics.Event.VIEW_SEARCH_RESULTS
    actual val EARN_VIRTUAL_CURRENCY: String get() = com.google.firebase.analytics.FirebaseAnalytics.Event.EARN_VIRTUAL_CURRENCY
    actual val SCREEN_VIEW: String get() = com.google.firebase.analytics.FirebaseAnalytics.Event.SCREEN_VIEW
    actual val REMOVE_FROM_CART: String get() = com.google.firebase.analytics.FirebaseAnalytics.Event.REMOVE_FROM_CART
    actual val CHECKOUT_PROGRESS: String get() = com.google.firebase.analytics.FirebaseAnalytics.Event.CHECKOUT_PROGRESS
    actual val SET_CHECKOUT_OPTION: String get() = com.google.firebase.analytics.FirebaseAnalytics.Event.SET_CHECKOUT_OPTION
    actual val ADD_SHIPPING_INFO: String get() = com.google.firebase.analytics.FirebaseAnalytics.Event.ADD_SHIPPING_INFO
    actual val PURCHASE: String get() = com.google.firebase.analytics.FirebaseAnalytics.Event.PURCHASE
    actual val REFUND: String get() = com.google.firebase.analytics.FirebaseAnalytics.Event.REFUND
    actual val SELECT_ITEM: String get() = com.google.firebase.analytics.FirebaseAnalytics.Event.SELECT_ITEM
    actual val SELECT_PROMOTION: String get() = com.google.firebase.analytics.FirebaseAnalytics.Event.SELECT_PROMOTION
    actual val VIEW_CART: String get() = com.google.firebase.analytics.FirebaseAnalytics.Event.VIEW_CART
    actual val VIEW_PROMOTION: String get() = com.google.firebase.analytics.FirebaseAnalytics.Event.VIEW_PROMOTION
  }

  actual object Param {
    actual val ACHIEVEMENT_ID: String get() = com.google.firebase.analytics.FirebaseAnalytics.Param.ACHIEVEMENT_ID
    actual val AD_FORMAT: String get() = com.google.firebase.analytics.FirebaseAnalytics.Param.AD_FORMAT
    actual val AD_PLATFORM: String get() = com.google.firebase.analytics.FirebaseAnalytics.Param.AD_PLATFORM
    actual val AD_SOURCE: String get() = com.google.firebase.analytics.FirebaseAnalytics.Param.AD_SOURCE
    actual val AD_UNIT_NAME: String get() = com.google.firebase.analytics.FirebaseAnalytics.Param.AD_UNIT_NAME
    actual val CHARACTER: String get() = com.google.firebase.analytics.FirebaseAnalytics.Param.CHARACTER
    actual val TRAVEL_CLASS: String get() = com.google.firebase.analytics.FirebaseAnalytics.Param.TRAVEL_CLASS
    actual val CONTENT_TYPE: String get() = com.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT_TYPE
    actual val CURRENCY: String get() = com.google.firebase.analytics.FirebaseAnalytics.Param.CURRENCY
    actual val COUPON: String get() = com.google.firebase.analytics.FirebaseAnalytics.Param.COUPON
    actual val START_DATE: String get() = com.google.firebase.analytics.FirebaseAnalytics.Param.START_DATE
    actual val END_DATE: String get() = com.google.firebase.analytics.FirebaseAnalytics.Param.END_DATE
    actual val EXTEND_SESSION: String get() = com.google.firebase.analytics.FirebaseAnalytics.Param.EXTEND_SESSION
    actual val FLIGHT_NUMBER: String get() = com.google.firebase.analytics.FirebaseAnalytics.Param.FLIGHT_NUMBER
    actual val GROUP_ID: String get() = com.google.firebase.analytics.FirebaseAnalytics.Param.GROUP_ID
    actual val ITEM_CATEGORY: String get() = com.google.firebase.analytics.FirebaseAnalytics.Param.ITEM_CATEGORY
    actual val ITEM_ID: String get() = com.google.firebase.analytics.FirebaseAnalytics.Param.ITEM_ID
    actual val ITEM_LOCATION_ID: String get() = com.google.firebase.analytics.FirebaseAnalytics.Param.ITEM_LOCATION_ID
    actual val ITEM_NAME: String get() = com.google.firebase.analytics.FirebaseAnalytics.Param.ITEM_NAME
    actual val LOCATION: String get() = com.google.firebase.analytics.FirebaseAnalytics.Param.LOCATION
    actual val LEVEL: String get() = com.google.firebase.analytics.FirebaseAnalytics.Param.LEVEL
    actual val LEVEL_NAME: String get() = com.google.firebase.analytics.FirebaseAnalytics.Param.LEVEL_NAME
    actual val SIGN_UP_METHOD: String get() = com.google.firebase.analytics.FirebaseAnalytics.Param.SIGN_UP_METHOD
    actual val METHOD: String get() = com.google.firebase.analytics.FirebaseAnalytics.Param.METHOD
    actual val NUMBER_OF_NIGHTS: String get() = com.google.firebase.analytics.FirebaseAnalytics.Param.NUMBER_OF_NIGHTS
    actual val NUMBER_OF_PASSENGERS: String get() = com.google.firebase.analytics.FirebaseAnalytics.Param.NUMBER_OF_PASSENGERS
    actual val NUMBER_OF_ROOMS: String get() = com.google.firebase.analytics.FirebaseAnalytics.Param.NUMBER_OF_ROOMS
    actual val DESTINATION: String get() = com.google.firebase.analytics.FirebaseAnalytics.Param.DESTINATION
    actual val ORIGIN: String get() = com.google.firebase.analytics.FirebaseAnalytics.Param.ORIGIN
    actual val PRICE: String get() = com.google.firebase.analytics.FirebaseAnalytics.Param.PRICE
    actual val QUANTITY: String get() = com.google.firebase.analytics.FirebaseAnalytics.Param.QUANTITY
    actual val SCORE: String get() = com.google.firebase.analytics.FirebaseAnalytics.Param.SCORE
    actual val SHIPPING: String get() = com.google.firebase.analytics.FirebaseAnalytics.Param.SHIPPING
    actual val TRANSACTION_ID: String get() = com.google.firebase.analytics.FirebaseAnalytics.Param.TRANSACTION_ID
    actual val SEARCH_TERM: String get() = com.google.firebase.analytics.FirebaseAnalytics.Param.SEARCH_TERM
    actual val SUCCESS: String get() = com.google.firebase.analytics.FirebaseAnalytics.Param.SUCCESS
    actual val TAX: String get() = com.google.firebase.analytics.FirebaseAnalytics.Param.TAX
    actual val VALUE: String get() = com.google.firebase.analytics.FirebaseAnalytics.Param.VALUE
    actual val VIRTUAL_CURRENCY_NAME: String get() = com.google.firebase.analytics.FirebaseAnalytics.Param.VIRTUAL_CURRENCY_NAME
    actual val CAMPAIGN: String get() = com.google.firebase.analytics.FirebaseAnalytics.Param.CAMPAIGN
    actual val SOURCE: String get() = com.google.firebase.analytics.FirebaseAnalytics.Param.SOURCE
    actual val MEDIUM: String get() = com.google.firebase.analytics.FirebaseAnalytics.Param.MEDIUM
    actual val TERM: String get() = com.google.firebase.analytics.FirebaseAnalytics.Param.TERM
    actual val CONTENT: String get() = com.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT
    actual val ACLID: String get() = com.google.firebase.analytics.FirebaseAnalytics.Param.ACLID
    actual val CP1: String get() = com.google.firebase.analytics.FirebaseAnalytics.Param.CP1
    actual val ITEM_BRAND: String get() = com.google.firebase.analytics.FirebaseAnalytics.Param.ITEM_BRAND
    actual val ITEM_VARIANT: String get() = com.google.firebase.analytics.FirebaseAnalytics.Param.ITEM_VARIANT
    actual val ITEM_LIST: String get() = com.google.firebase.analytics.FirebaseAnalytics.Param.ITEM_LIST
    actual val CHECKOUT_STEP: String get() = com.google.firebase.analytics.FirebaseAnalytics.Param.CHECKOUT_STEP
    actual val CHECKOUT_OPTION: String get() = com.google.firebase.analytics.FirebaseAnalytics.Param.CHECKOUT_OPTION
    actual val CREATIVE_NAME: String get() = com.google.firebase.analytics.FirebaseAnalytics.Param.CREATIVE_NAME
    actual val CREATIVE_SLOT: String get() = com.google.firebase.analytics.FirebaseAnalytics.Param.CREATIVE_SLOT
    actual val AFFILIATION: String get() = com.google.firebase.analytics.FirebaseAnalytics.Param.AFFILIATION
    actual val INDEX: String get() = com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX
    actual val DISCOUNT: String get() = com.google.firebase.analytics.FirebaseAnalytics.Param.DISCOUNT
    actual val ITEM_CATEGORY2: String get() = com.google.firebase.analytics.FirebaseAnalytics.Param.ITEM_CATEGORY2
    actual val ITEM_CATEGORY3: String get() = com.google.firebase.analytics.FirebaseAnalytics.Param.ITEM_CATEGORY3
    actual val ITEM_CATEGORY4: String get() = com.google.firebase.analytics.FirebaseAnalytics.Param.ITEM_CATEGORY4
    actual val ITEM_CATEGORY5: String get() = com.google.firebase.analytics.FirebaseAnalytics.Param.ITEM_CATEGORY5
    actual val ITEM_LIST_ID: String get() = com.google.firebase.analytics.FirebaseAnalytics.Param.ITEM_LIST_ID
    actual val ITEM_LIST_NAME: String get() = com.google.firebase.analytics.FirebaseAnalytics.Param.ITEM_LIST_NAME
    actual val ITEMS: String get() = com.google.firebase.analytics.FirebaseAnalytics.Param.ITEMS
    actual val LOCATION_ID: String get() = com.google.firebase.analytics.FirebaseAnalytics.Param.LOCATION_ID
    actual val PAYMENT_TYPE: String get() = com.google.firebase.analytics.FirebaseAnalytics.Param.PAYMENT_TYPE
    actual val PROMOTION_ID: String get() = com.google.firebase.analytics.FirebaseAnalytics.Param.PROMOTION_ID
    actual val PROMOTION_NAME: String get() = com.google.firebase.analytics.FirebaseAnalytics.Param.PROMOTION_NAME
    actual val SCREEN_CLASS: String get() = com.google.firebase.analytics.FirebaseAnalytics.Param.SCREEN_CLASS
    actual val SCREEN_NAME: String get() = com.google.firebase.analytics.FirebaseAnalytics.Param.SCREEN_NAME
    actual val SHIPPING_TIER: String get() = com.google.firebase.analytics.FirebaseAnalytics.Param.SHIPPING_TIER
  }
}

actual typealias FirebaseParametersBuilder = com.google.firebase.analytics.ktx.ParametersBuilder
