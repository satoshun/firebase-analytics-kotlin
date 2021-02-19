package com.github.satoshun.firebase.analytics

import cocoapods.FirebaseAnalytics.FIRAnalyticsMeta
import cocoapods.FirebaseAnalytics.kFIREventAdImpression
import cocoapods.FirebaseAnalytics.kFIREventAddPaymentInfo
import cocoapods.FirebaseAnalytics.kFIREventAddShippingInfo
import cocoapods.FirebaseAnalytics.kFIREventAddToCart
import cocoapods.FirebaseAnalytics.kFIREventAddToWishlist
import cocoapods.FirebaseAnalytics.kFIREventAppOpen
import cocoapods.FirebaseAnalytics.kFIREventBeginCheckout
import cocoapods.FirebaseAnalytics.kFIREventCampaignDetails
import cocoapods.FirebaseAnalytics.kFIREventCheckoutProgress
import cocoapods.FirebaseAnalytics.kFIREventEarnVirtualCurrency
import cocoapods.FirebaseAnalytics.kFIREventEcommercePurchase
import cocoapods.FirebaseAnalytics.kFIREventGenerateLead
import cocoapods.FirebaseAnalytics.kFIREventJoinGroup
import cocoapods.FirebaseAnalytics.kFIREventLevelEnd
import cocoapods.FirebaseAnalytics.kFIREventLevelStart
import cocoapods.FirebaseAnalytics.kFIREventLevelUp
import cocoapods.FirebaseAnalytics.kFIREventLogin
import cocoapods.FirebaseAnalytics.kFIREventPostScore
import cocoapods.FirebaseAnalytics.kFIREventPresentOffer
import cocoapods.FirebaseAnalytics.kFIREventPurchase
import cocoapods.FirebaseAnalytics.kFIREventPurchaseRefund
import cocoapods.FirebaseAnalytics.kFIREventRefund
import cocoapods.FirebaseAnalytics.kFIREventRemoveFromCart
import cocoapods.FirebaseAnalytics.kFIREventScreenView
import cocoapods.FirebaseAnalytics.kFIREventSearch
import cocoapods.FirebaseAnalytics.kFIREventSelectContent
import cocoapods.FirebaseAnalytics.kFIREventSelectItem
import cocoapods.FirebaseAnalytics.kFIREventSelectPromotion
import cocoapods.FirebaseAnalytics.kFIREventSetCheckoutOption
import cocoapods.FirebaseAnalytics.kFIREventShare
import cocoapods.FirebaseAnalytics.kFIREventSignUp
import cocoapods.FirebaseAnalytics.kFIREventSpendVirtualCurrency
import cocoapods.FirebaseAnalytics.kFIREventTutorialBegin
import cocoapods.FirebaseAnalytics.kFIREventTutorialComplete
import cocoapods.FirebaseAnalytics.kFIREventUnlockAchievement
import cocoapods.FirebaseAnalytics.kFIREventViewCart
import cocoapods.FirebaseAnalytics.kFIREventViewItem
import cocoapods.FirebaseAnalytics.kFIREventViewItemList
import cocoapods.FirebaseAnalytics.kFIREventViewPromotion
import cocoapods.FirebaseAnalytics.kFIREventViewSearchResults
import cocoapods.FirebaseAnalytics.kFIRParameterAchievementID
import cocoapods.FirebaseAnalytics.kFIRParameterAdFormat
import cocoapods.FirebaseAnalytics.kFIRParameterAdPlatform
import cocoapods.FirebaseAnalytics.kFIRParameterAdSource
import cocoapods.FirebaseAnalytics.kFIRParameterAdUnitName
import cocoapods.FirebaseAnalytics.kFIRParameterAffiliation
import cocoapods.FirebaseAnalytics.kFIRParameterCP1
import cocoapods.FirebaseAnalytics.kFIRParameterCampaign
import cocoapods.FirebaseAnalytics.kFIRParameterCharacter
import cocoapods.FirebaseAnalytics.kFIRParameterCheckoutOption
import cocoapods.FirebaseAnalytics.kFIRParameterCheckoutStep
import cocoapods.FirebaseAnalytics.kFIRParameterContent
import cocoapods.FirebaseAnalytics.kFIRParameterContentType
import cocoapods.FirebaseAnalytics.kFIRParameterCoupon
import cocoapods.FirebaseAnalytics.kFIRParameterCreativeName
import cocoapods.FirebaseAnalytics.kFIRParameterCreativeSlot
import cocoapods.FirebaseAnalytics.kFIRParameterCurrency
import cocoapods.FirebaseAnalytics.kFIRParameterDestination
import cocoapods.FirebaseAnalytics.kFIRParameterDiscount
import cocoapods.FirebaseAnalytics.kFIRParameterEndDate
import cocoapods.FirebaseAnalytics.kFIRParameterExtendSession
import cocoapods.FirebaseAnalytics.kFIRParameterFlightNumber
import cocoapods.FirebaseAnalytics.kFIRParameterGroupID
import cocoapods.FirebaseAnalytics.kFIRParameterIndex
import cocoapods.FirebaseAnalytics.kFIRParameterItemBrand
import cocoapods.FirebaseAnalytics.kFIRParameterItemCategory
import cocoapods.FirebaseAnalytics.kFIRParameterItemCategory2
import cocoapods.FirebaseAnalytics.kFIRParameterItemCategory3
import cocoapods.FirebaseAnalytics.kFIRParameterItemCategory4
import cocoapods.FirebaseAnalytics.kFIRParameterItemCategory5
import cocoapods.FirebaseAnalytics.kFIRParameterItemID
import cocoapods.FirebaseAnalytics.kFIRParameterItemList
import cocoapods.FirebaseAnalytics.kFIRParameterItemListID
import cocoapods.FirebaseAnalytics.kFIRParameterItemListName
import cocoapods.FirebaseAnalytics.kFIRParameterItemName
import cocoapods.FirebaseAnalytics.kFIRParameterItemVariant
import cocoapods.FirebaseAnalytics.kFIRParameterItems
import cocoapods.FirebaseAnalytics.kFIRParameterLevel
import cocoapods.FirebaseAnalytics.kFIRParameterLevelName
import cocoapods.FirebaseAnalytics.kFIRParameterLocation
import cocoapods.FirebaseAnalytics.kFIRParameterLocationID
import cocoapods.FirebaseAnalytics.kFIRParameterMedium
import cocoapods.FirebaseAnalytics.kFIRParameterMethod
import cocoapods.FirebaseAnalytics.kFIRParameterNumberOfNights
import cocoapods.FirebaseAnalytics.kFIRParameterNumberOfPassengers
import cocoapods.FirebaseAnalytics.kFIRParameterNumberOfRooms
import cocoapods.FirebaseAnalytics.kFIRParameterOrigin
import cocoapods.FirebaseAnalytics.kFIRParameterPaymentType
import cocoapods.FirebaseAnalytics.kFIRParameterPrice
import cocoapods.FirebaseAnalytics.kFIRParameterPromotionID
import cocoapods.FirebaseAnalytics.kFIRParameterPromotionName
import cocoapods.FirebaseAnalytics.kFIRParameterQuantity
import cocoapods.FirebaseAnalytics.kFIRParameterScore
import cocoapods.FirebaseAnalytics.kFIRParameterScreenClass
import cocoapods.FirebaseAnalytics.kFIRParameterScreenName
import cocoapods.FirebaseAnalytics.kFIRParameterSearchTerm
import cocoapods.FirebaseAnalytics.kFIRParameterShipping
import cocoapods.FirebaseAnalytics.kFIRParameterShippingTier
import cocoapods.FirebaseAnalytics.kFIRParameterSignUpMethod
import cocoapods.FirebaseAnalytics.kFIRParameterSource
import cocoapods.FirebaseAnalytics.kFIRParameterStartDate
import cocoapods.FirebaseAnalytics.kFIRParameterSuccess
import cocoapods.FirebaseAnalytics.kFIRParameterTax
import cocoapods.FirebaseAnalytics.kFIRParameterTerm
import cocoapods.FirebaseAnalytics.kFIRParameterTransactionID
import cocoapods.FirebaseAnalytics.kFIRParameterTravelClass
import cocoapods.FirebaseAnalytics.kFIRParameterValue
import cocoapods.FirebaseAnalytics.kFIRParameterVirtualCurrencyName
import com.github.satoshun.firebase.Firebase
import cocoapods.FirebaseAnalytics.FIRAnalytics as fIRAnalytics

actual val Firebase.analytics: FirebaseAnalytics
  get() = FirebaseAnalytics(fIRAnalytics)

actual class FirebaseAnalytics(
  private val analytics: FIRAnalyticsMeta
) {
  actual fun logEvent(name: String) {
    logEvent(name, null)
  }

  actual fun logEvent(
    name: String,
    block: FirebaseParametersBuilder.() -> Unit
  ) {
    val builder = FirebaseParametersBuilder()
    builder.block()
    logEvent(name, builder.params)
  }

  fun logEvent(
    name: String,
    parameters: Map<String, *>?
  ) {
    analytics.logEventWithName(
      name = name,
      parameters = parameters?.toMap()
    )
  }

  actual fun setAnalyticsCollectionEnabled(enabled: Boolean) {
    analytics.setAnalyticsCollectionEnabled(enabled)
  }

  actual fun setUserId(id: String?) {
    analytics.setUserID(id)
  }

  actual fun setSessionTimeoutDuration(milliseconds: Long) {
    analytics.setSessionTimeoutInterval(milliseconds / 1000.0)
  }

  actual suspend fun getAppInstanceId(): String {
    return analytics.appInstanceID()!!
  }

  actual fun resetAnalyticsData() {
    analytics.resetAnalyticsData()
  }

  actual fun setUserProperty(name: String, value: String) {
    analytics.setUserPropertyString(name, value)
  }

  fun setScreenName(screenName: String?, screenClass: String?) {
    analytics.setScreenName(screenName, screenClass)
  }

  fun setDefaultEventParameters(parameters: Map<String, *>?) {
    analytics.setDefaultEventParameters(parameters?.toMap())
  }

  actual object Event {
    actual val AD_IMPRESSION: String get() = kFIREventAdImpression!!
    actual val ADD_PAYMENT_INFO: String get() = kFIREventAddPaymentInfo!!
    actual val ADD_TO_CART: String get() = kFIREventAddToCart!!
    actual val ADD_TO_WISHLIST: String get() = kFIREventAddToWishlist!!
    actual val APP_OPEN: String get() = kFIREventAppOpen!!
    actual val BEGIN_CHECKOUT: String get() = kFIREventBeginCheckout!!
    actual val CAMPAIGN_DETAILS: String get() = kFIREventCampaignDetails!!
    actual val ECOMMERCE_PURCHASE: String get() = kFIREventEcommercePurchase!!
    actual val GENERATE_LEAD: String get() = kFIREventGenerateLead!!
    actual val JOIN_GROUP: String get() = kFIREventJoinGroup!!
    actual val LEVEL_END: String get() = kFIREventLevelEnd!!
    actual val LEVEL_START: String get() = kFIREventLevelStart!!
    actual val LEVEL_UP: String get() = kFIREventLevelUp!!
    actual val LOGIN: String get() = kFIREventLogin!!
    actual val POST_SCORE: String get() = kFIREventPostScore!!
    actual val PRESENT_OFFER: String get() = kFIREventPresentOffer!!
    actual val PURCHASE_REFUND: String get() = kFIREventPurchaseRefund!!
    actual val SEARCH: String get() = kFIREventSearch!!
    actual val SELECT_CONTENT: String get() = kFIREventSelectContent!!
    actual val SHARE: String get() = kFIREventShare!!
    actual val SIGN_UP: String get() = kFIREventSignUp!!
    actual val SPEND_VIRTUAL_CURRENCY: String get() = kFIREventSpendVirtualCurrency!!
    actual val TUTORIAL_BEGIN: String get() = kFIREventTutorialBegin!!
    actual val TUTORIAL_COMPLETE: String get() = kFIREventTutorialComplete!!
    actual val UNLOCK_ACHIEVEMENT: String get() = kFIREventUnlockAchievement!!
    actual val VIEW_ITEM: String get() = kFIREventViewItem!!
    actual val VIEW_ITEM_LIST: String get() = kFIREventViewItemList!!
    actual val VIEW_SEARCH_RESULTS: String get() = kFIREventViewSearchResults!!
    actual val EARN_VIRTUAL_CURRENCY: String get() = kFIREventEarnVirtualCurrency!!
    actual val SCREEN_VIEW: String get() = kFIREventScreenView!!
    actual val REMOVE_FROM_CART: String get() = kFIREventRemoveFromCart!!
    actual val CHECKOUT_PROGRESS: String get() = kFIREventCheckoutProgress!!
    actual val SET_CHECKOUT_OPTION: String get() = kFIREventSetCheckoutOption!!
    actual val ADD_SHIPPING_INFO: String get() = kFIREventAddShippingInfo!!
    actual val PURCHASE: String get() = kFIREventPurchase!!
    actual val REFUND: String get() = kFIREventRefund!!
    actual val SELECT_ITEM: String get() = kFIREventSelectItem!!
    actual val SELECT_PROMOTION: String get() = kFIREventSelectPromotion!!
    actual val VIEW_CART: String get() = kFIREventViewCart!!
    actual val VIEW_PROMOTION: String get() = kFIREventViewPromotion!!
  }

  actual object Param {
    actual val ACHIEVEMENT_ID: String get() = kFIRParameterAchievementID!!
    actual val AD_FORMAT: String get() = kFIRParameterAdFormat!!
    actual val AD_PLATFORM: String get() = kFIRParameterAdPlatform!!
    actual val AD_SOURCE: String get() = kFIRParameterAdSource!!
    actual val AD_UNIT_NAME: String get() = kFIRParameterAdUnitName!!
    actual val CHARACTER: String get() = kFIRParameterCharacter!!
    actual val TRAVEL_CLASS: String get() = kFIRParameterTravelClass!!
    actual val CONTENT_TYPE: String get() = kFIRParameterContentType!!
    actual val CURRENCY: String get() = kFIRParameterCurrency!!
    actual val COUPON: String get() = kFIRParameterCoupon!!
    actual val START_DATE: String get() = kFIRParameterStartDate!!
    actual val END_DATE: String get() = kFIRParameterEndDate!!
    actual val EXTEND_SESSION: String get() = kFIRParameterExtendSession!!
    actual val FLIGHT_NUMBER: String get() = kFIRParameterFlightNumber!!
    actual val GROUP_ID: String get() = kFIRParameterGroupID!!
    actual val ITEM_CATEGORY: String get() = kFIRParameterItemCategory!!
    actual val ITEM_ID: String get() = kFIRParameterItemID!!
    actual val ITEM_LOCATION_ID: String get() = kFIRParameterLocationID!!
    actual val ITEM_NAME: String get() = kFIRParameterItemName!!
    actual val LOCATION: String get() = kFIRParameterLocation!!
    actual val LEVEL: String get() = kFIRParameterLevel!!
    actual val LEVEL_NAME: String get() = kFIRParameterLevelName!!
    actual val SIGN_UP_METHOD: String get() = kFIRParameterSignUpMethod!!
    actual val METHOD: String get() = kFIRParameterMethod!!
    actual val NUMBER_OF_NIGHTS: String get() = kFIRParameterNumberOfNights!!
    actual val NUMBER_OF_PASSENGERS: String get() = kFIRParameterNumberOfPassengers!!
    actual val NUMBER_OF_ROOMS: String get() = kFIRParameterNumberOfRooms!!
    actual val DESTINATION: String get() = kFIRParameterDestination!!
    actual val ORIGIN: String get() = kFIRParameterOrigin!!
    actual val PRICE: String get() = kFIRParameterPrice!!
    actual val QUANTITY: String get() = kFIRParameterQuantity!!
    actual val SCORE: String get() = kFIRParameterScore!!
    actual val SHIPPING: String get() = kFIRParameterShipping!!
    actual val TRANSACTION_ID: String get() = kFIRParameterTransactionID!!
    actual val SEARCH_TERM: String get() = kFIRParameterSearchTerm!!
    actual val SUCCESS: String get() = kFIRParameterSuccess!!
    actual val TAX: String get() = kFIRParameterTax!!
    actual val VALUE: String get() = kFIRParameterValue!!
    actual val VIRTUAL_CURRENCY_NAME: String get() = kFIRParameterVirtualCurrencyName!!
    actual val CAMPAIGN: String get() = kFIRParameterCampaign!!
    actual val SOURCE: String get() = kFIRParameterSource!!
    actual val MEDIUM: String get() = kFIRParameterMedium!!
    actual val TERM: String get() = kFIRParameterTerm!!
    actual val CONTENT: String get() = kFIRParameterContent!!
    actual val ACLID: String get() = "aclid"
    actual val CP1: String get() = kFIRParameterCP1!!
    actual val ITEM_BRAND: String get() = kFIRParameterItemBrand!!
    actual val ITEM_VARIANT: String get() = kFIRParameterItemVariant!!
    actual val ITEM_LIST: String get() = kFIRParameterItemList!!
    actual val CHECKOUT_STEP: String get() = kFIRParameterCheckoutStep!!
    actual val CHECKOUT_OPTION: String get() = kFIRParameterCheckoutOption!!
    actual val CREATIVE_NAME: String get() = kFIRParameterCreativeName!!
    actual val CREATIVE_SLOT: String get() = kFIRParameterCreativeSlot!!
    actual val AFFILIATION: String get() = kFIRParameterAffiliation!!
    actual val INDEX: String get() = kFIRParameterIndex!!
    actual val DISCOUNT: String get() = kFIRParameterDiscount!!
    actual val ITEM_CATEGORY2: String get() = kFIRParameterItemCategory2!!
    actual val ITEM_CATEGORY3: String get() = kFIRParameterItemCategory3!!
    actual val ITEM_CATEGORY4: String get() = kFIRParameterItemCategory4!!
    actual val ITEM_CATEGORY5: String get() = kFIRParameterItemCategory5!!
    actual val ITEM_LIST_ID: String get() = kFIRParameterItemListID!!
    actual val ITEM_LIST_NAME: String get() = kFIRParameterItemListName!!
    actual val ITEMS: String get() = kFIRParameterItems!!
    actual val LOCATION_ID: String get() = kFIRParameterLocationID!!
    actual val PAYMENT_TYPE: String get() = kFIRParameterPaymentType!!
    actual val PROMOTION_ID: String get() = kFIRParameterPromotionID!!
    actual val PROMOTION_NAME: String get() = kFIRParameterPromotionName!!
    actual val SCREEN_CLASS: String get() = kFIRParameterScreenClass!!
    actual val SCREEN_NAME: String get() = kFIRParameterScreenName!!
    actual val SHIPPING_TIER: String get() = kFIRParameterShippingTier!!
  }
}

actual class FirebaseParametersBuilder {
  internal val params: MutableMap<String, Any> = mutableMapOf()

  actual fun param(key: String, value: Double) {
    params[key] = value
  }

  actual fun param(key: String, value: Long) {
    params[key] = value
  }

  actual fun param(key: String, value: String) {
    params[key] = value
  }
}
