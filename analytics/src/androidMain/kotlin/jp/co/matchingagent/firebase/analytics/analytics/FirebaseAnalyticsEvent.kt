package jp.co.matchingagent.firebase.analytics.analytics

import com.google.firebase.analytics.FirebaseAnalytics

actual object FirebaseAnalyticsEvent {
  actual val AD_IMPRESSION: String get() = FirebaseAnalytics.Event.AD_IMPRESSION
  actual val ADD_PAYMENT_INFO: String get() = FirebaseAnalytics.Event.ADD_PAYMENT_INFO
  actual val ADD_TO_CART: String get() = FirebaseAnalytics.Event.ADD_TO_CART
  actual val ADD_TO_WISHLIST: String get() = FirebaseAnalytics.Event.ADD_TO_WISHLIST
  actual val APP_OPEN: String get() = FirebaseAnalytics.Event.APP_OPEN
  actual val BEGIN_CHECKOUT: String get() = FirebaseAnalytics.Event.BEGIN_CHECKOUT
  actual val CAMPAIGN_DETAILS: String get() = FirebaseAnalytics.Event.CAMPAIGN_DETAILS
  actual val ECOMMERCE_PURCHASE: String get() = FirebaseAnalytics.Event.ECOMMERCE_PURCHASE
  actual val GENERATE_LEAD: String get() = FirebaseAnalytics.Event.GENERATE_LEAD
  actual val JOIN_GROUP: String get() = FirebaseAnalytics.Event.JOIN_GROUP
  actual val LEVEL_END: String get() = FirebaseAnalytics.Event.LEVEL_END
  actual val LEVEL_START: String get() = FirebaseAnalytics.Event.LEVEL_START
  actual val LEVEL_UP: String get() = FirebaseAnalytics.Event.LEVEL_UP
  actual val LOGIN: String get() = FirebaseAnalytics.Event.LOGIN
  actual val POST_SCORE: String get() = FirebaseAnalytics.Event.POST_SCORE
  actual val PRESENT_OFFER: String get() = FirebaseAnalytics.Event.PRESENT_OFFER
  actual val PURCHASE_REFUND: String get() = FirebaseAnalytics.Event.PURCHASE_REFUND
  actual val SEARCH: String get() = FirebaseAnalytics.Event.SEARCH
  actual val SELECT_CONTENT: String get() = FirebaseAnalytics.Event.SELECT_CONTENT
  actual val SHARE: String get() = FirebaseAnalytics.Event.SHARE
  actual val SIGN_UP: String get() = FirebaseAnalytics.Event.SIGN_UP
  actual val SPEND_VIRTUAL_CURRENCY: String get() = FirebaseAnalytics.Event.SPEND_VIRTUAL_CURRENCY
  actual val TUTORIAL_BEGIN: String get() = FirebaseAnalytics.Event.TUTORIAL_BEGIN
  actual val TUTORIAL_COMPLETE: String get() = FirebaseAnalytics.Event.TUTORIAL_COMPLETE
  actual val UNLOCK_ACHIEVEMENT: String get() = FirebaseAnalytics.Event.UNLOCK_ACHIEVEMENT
  actual val VIEW_ITEM: String get() = FirebaseAnalytics.Event.VIEW_ITEM
  actual val VIEW_ITEM_LIST: String get() = FirebaseAnalytics.Event.VIEW_ITEM_LIST
  actual val VIEW_SEARCH_RESULTS: String get() = FirebaseAnalytics.Event.VIEW_SEARCH_RESULTS
  actual val EARN_VIRTUAL_CURRENCY: String get() = FirebaseAnalytics.Event.EARN_VIRTUAL_CURRENCY
  actual val SCREEN_VIEW: String get() = FirebaseAnalytics.Event.SCREEN_VIEW
  actual val REMOVE_FROM_CART: String get() = FirebaseAnalytics.Event.REMOVE_FROM_CART
  actual val CHECKOUT_PROGRESS: String get() = FirebaseAnalytics.Event.CHECKOUT_PROGRESS
  actual val SET_CHECKOUT_OPTION: String get() = FirebaseAnalytics.Event.SET_CHECKOUT_OPTION
  actual val ADD_SHIPPING_INFO: String get() = FirebaseAnalytics.Event.ADD_SHIPPING_INFO
  actual val PURCHASE: String get() = FirebaseAnalytics.Event.PURCHASE
  actual val REFUND: String get() = FirebaseAnalytics.Event.REFUND
  actual val SELECT_ITEM: String get() = FirebaseAnalytics.Event.SELECT_ITEM
  actual val SELECT_PROMOTION: String get() = FirebaseAnalytics.Event.SELECT_PROMOTION
  actual val VIEW_CART: String get() = FirebaseAnalytics.Event.VIEW_CART
  actual val VIEW_PROMOTION: String get() = FirebaseAnalytics.Event.VIEW_PROMOTION
}
