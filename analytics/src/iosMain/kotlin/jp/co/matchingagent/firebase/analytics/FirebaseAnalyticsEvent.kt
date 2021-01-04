package jp.co.matchingagent.firebase.analytics

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

actual object FirebaseAnalyticsEvent {
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
