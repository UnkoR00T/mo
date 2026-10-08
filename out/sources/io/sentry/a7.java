package io.sentry;

import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public enum a7 implements d2 {
    Session("session"),
    Event("event"),
    UserFeedback("user_report"),
    Attachment("attachment"),
    Transaction("transaction"),
    Profile("profile"),
    ProfileChunk("profile_chunk"),
    ClientReport("client_report"),
    ReplayEvent("replay_event"),
    ReplayRecording("replay_recording"),
    ReplayVideo("replay_video"),
    CheckIn("check_in"),
    Feedback("feedback"),
    Log("log"),
    Unknown("__unknown__");

    private final String itemType;

    public static final class a implements t1<a7> {
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a7 a(k3 k3Var, v0 v0Var) {
            return a7.valueOfLabel(k3Var.q2().toLowerCase(Locale.ROOT));
        }
    }

    a7(String str) {
        this.itemType = str;
    }

    public static a7 resolve(Object obj) {
        if (obj instanceof r6) {
            return ((r6) obj).C().f() == null ? Event : Feedback;
        }
        if (obj instanceof io.sentry.protocol.c0) {
            return Transaction;
        }
        if (obj instanceof i8) {
            return Session;
        }
        return obj instanceof io.sentry.clientreport.c ? ClientReport : Attachment;
    }

    public static a7 valueOfLabel(String str) {
        for (a7 a7Var : values()) {
            if (a7Var.itemType.equals(str)) {
                return a7Var;
            }
        }
        return Unknown;
    }

    public String getItemType() {
        return this.itemType;
    }

    @Override // io.sentry.d2
    public void serialize(l3 l3Var, v0 v0Var) {
        l3Var.h(this.itemType);
    }
}
