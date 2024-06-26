package com.webcare.zoom;

import android.util.Log;

import java.util.List;

import io.flutter.plugin.common.EventChannel;
import us.zoom.sdk.ChatMessageDeleteType;
import us.zoom.sdk.FreeMeetingNeedUpgradeType;
import us.zoom.sdk.IRequestLocalRecordingPrivilegeHandler;
import us.zoom.sdk.InMeetingAudioController;
import us.zoom.sdk.InMeetingChatController;
import us.zoom.sdk.InMeetingChatMessage;
import us.zoom.sdk.InMeetingEventHandler;
import us.zoom.sdk.InMeetingService;
import us.zoom.sdk.InMeetingServiceListener;
import us.zoom.sdk.LocalRecordingRequestPrivilegeStatus;
import us.zoom.sdk.VideoQuality;

public class InMeetingListener implements EventChannel.StreamHandler {
    private final InMeetingService inMeetingService;

    private InMeetingServiceListener listener;

    public InMeetingListener(InMeetingService inMeetingService) {
        this.inMeetingService = inMeetingService;
    }

    @Override
    public void onCancel(Object arguments) {
        inMeetingService.removeListener(listener);
        listener = null;
    }

    @Override
    public void onListen(Object arguments, EventChannel.EventSink events) {
        listener = new InMeetingServiceListener() {
            @Override
            public void onMeetingLeaveComplete(long l) {
                events.success(l);
            }

            @Override
            public void onMeetingNeedPasswordOrDisplayName(boolean b, boolean b1, InMeetingEventHandler inMeetingEventHandler) {

            }

            @Override
            public void onWebinarNeedRegister(String s) {

            }

            @Override
            public void onJoinWebinarNeedUserNameAndEmail(InMeetingEventHandler inMeetingEventHandler) {

            }

            @Override
            public void onMeetingNeedCloseOtherMeeting(InMeetingEventHandler inMeetingEventHandler) {

            }

            @Override
            public void onMeetingFail(int i, int i1) {

            }

            @Override
            public void onMeetingUserJoin(List<Long> list) {

            }

            @Override
            public void onMeetingUserLeave(List<Long> list) {

            }

            @Override
            public void onMeetingUserUpdated(long l) {

            }

            @Override
            public void onMeetingHostChanged(long l) {

            }

            @Override
            public void onMeetingCoHostChanged(long l) {

            }

            @Override
            public void onMeetingCoHostChange(long l, boolean b) {

            }

            @Override
            public void onActiveVideoUserChanged(long l) {

            }

            @Override
            public void onActiveSpeakerVideoUserChanged(long l) {

            }

            @Override
            public void onHostVideoOrderUpdated(List<Long> list) {

            }

            @Override
            public void onFollowHostVideoOrderChanged(boolean b) {

            }

            @Override
            public void onSpotlightVideoChanged(boolean b) {

            }

            @Override
            public void onSpotlightVideoChanged(List<Long> list) {

            }

            @Override
            public void onUserVideoStatusChanged(long l, VideoStatus videoStatus) {

            }

            @Override
            public void onUserNetworkQualityChanged(long l) {

            }

            @Override
            public void onSinkMeetingVideoQualityChanged(VideoQuality videoQuality, long l) {

            }

            @Override
            public void onMicrophoneStatusError(InMeetingAudioController.MobileRTCMicrophoneError mobileRTCMicrophoneError) {

            }

            @Override
            public void onUserAudioStatusChanged(long l, AudioStatus audioStatus) {

            }

            @Override
            public void onHostAskUnMute(long l) {

            }

            @Override
            public void onHostAskStartVideo(long l) {

            }

            @Override
            public void onUserAudioTypeChanged(long l) {

            }

            @Override
            public void onMyAudioSourceTypeChanged(int i) {

            }

            @Override
            public void onLowOrRaiseHandStatusChanged(long l, boolean b) {

            }

            @Override
            public void onChatMessageReceived(InMeetingChatMessage inMeetingChatMessage) {

            }

            @Override
            public void onChatMsgDeleteNotification(String s, ChatMessageDeleteType chatMessageDeleteType) {

            }

            @Override
            public void onShareMeetingChatStatusChanged(boolean b) {

            }

            @Override
            public void onSilentModeChanged(boolean b) {

            }

            @Override
            public void onFreeMeetingReminder(boolean b, boolean b1, boolean b2) {

            }

            @Override
            public void onMeetingActiveVideo(long l) {

            }

            @Override
            public void onSinkAttendeeChatPriviledgeChanged(int i) {

            }

            @Override
            public void onSinkAllowAttendeeChatNotification(int i) {

            }

            @Override
            public void onSinkPanelistChatPrivilegeChanged(InMeetingChatController.MobileRTCWebinarPanelistChatPrivilege mobileRTCWebinarPanelistChatPrivilege) {

            }

            @Override
            public void onUserNameChanged(long l, String s) {

            }

            @Override
            public void onUserNamesChanged(List<Long> list) {

            }

            @Override
            public void onFreeMeetingNeedToUpgrade(FreeMeetingNeedUpgradeType freeMeetingNeedUpgradeType, String s) {

            }

            @Override
            public void onFreeMeetingUpgradeToGiftFreeTrialStart() {

            }

            @Override
            public void onFreeMeetingUpgradeToGiftFreeTrialStop() {

            }

            @Override
            public void onFreeMeetingUpgradeToProMeeting() {

            }

            @Override
            public void onClosedCaptionReceived(String s, long l) {

            }

            @Override
            public void onRecordingStatus(RecordingStatus recordingStatus) {

            }

            @Override
            public void onLocalRecordingStatus(long l, RecordingStatus recordingStatus) {

            }

            @Override
            public void onInvalidReclaimHostkey() {

            }

            @Override
            public void onPermissionRequested(String[] strings) {

            }

            @Override
            public void onAllHandsLowered() {

            }

            @Override
            public void onLocalVideoOrderUpdated(List<Long> list) {

            }

            @Override
            public void onLocalRecordingPrivilegeRequested(IRequestLocalRecordingPrivilegeHandler iRequestLocalRecordingPrivilegeHandler) {

            }

            @Override
            public void onSuspendParticipantsActivities() {

            }

            @Override
            public void onAllowParticipantsStartVideoNotification(boolean b) {

            }

            @Override
            public void onAllowParticipantsRenameNotification(boolean b) {

            }

            @Override
            public void onAllowParticipantsUnmuteSelfNotification(boolean b) {

            }

            @Override
            public void onAllowParticipantsShareWhiteBoardNotification(boolean b) {

            }

            @Override
            public void onMeetingLockStatus(boolean b) {

            }

            @Override
            public void onRequestLocalRecordingPriviligeChanged(LocalRecordingRequestPrivilegeStatus localRecordingRequestPrivilegeStatus) {

            }
        };
        inMeetingService.addListener(listener);
    }


}
