package co.si.main.zing.utils.notification

import co.si.main.zing.utils.notification.data.CallUserResponseAckVoip
import co.si.main.zing.utils.notification.data.FeatureDataPayload

fun convertFeatureDataToCallData(data: FeatureDataPayload): CallUserResponseAckVoip {
    return CallUserResponseAckVoip(
        callStatus = data.callStatus!!,
        clientId = data.clientId!!,
        callerDetail = data.callerDetail!!,
        receiversDetail = data.receiversDetail!!,
        roomId = data.roomId!!,
        receiverClientId = data.receiverClientId!!,
        audioVideoCall = data.audioVideoCall!!
    )
}
