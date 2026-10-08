package com.pl.pwpw.mobile.edoapp.edoLibrary.messages;

import dv.h;
import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u001aB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u000bJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/pl/pwpw/mobile/edoapp/edoLibrary/messages/ProcessStartedMessage;", "Lcom/pl/pwpw/mobile/edoapp/edoLibrary/messages/IMessage;", "", "content", "", "code", "<init>", "(Ljava/lang/String;I)V", "component1", "()Ljava/lang/String;", "component2", "()I", "copy", "(Ljava/lang/String;I)Lcom/pl/pwpw/mobile/edoapp/edoLibrary/messages/ProcessStartedMessage;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getContent", "I", "getCode", "Companion", "nuL/h", "edoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ProcessStartedMessage implements IMessage {
    public static final h Companion = new h();
    private final int code;
    private final String content;

    public ProcessStartedMessage(String str, int i15) {
        this.content = str;
        this.code = i15;
    }

    public static /* synthetic */ ProcessStartedMessage copy$default(ProcessStartedMessage processStartedMessage, String str, int i15, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            str = processStartedMessage.content;
        }
        if ((i16 & 2) != 0) {
            i15 = processStartedMessage.code;
        }
        return processStartedMessage.copy(str, i15);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    public final ProcessStartedMessage copy(String content, int code) {
        return new ProcessStartedMessage(content, code);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProcessStartedMessage)) {
            return false;
        }
        ProcessStartedMessage processStartedMessage = (ProcessStartedMessage) other;
        return t.c(this.content, processStartedMessage.content) && this.code == processStartedMessage.code;
    }

    @Override // com.pl.pwpw.mobile.edoapp.edoLibrary.messages.IMessage
    public int getCode() {
        return this.code;
    }

    @Override // com.pl.pwpw.mobile.edoapp.edoLibrary.messages.IMessage
    public String getContent() {
        return this.content;
    }

    public int hashCode() {
        return Integer.hashCode(this.code) + (this.content.hashCode() * 31);
    }

    public String toString() {
        return "ProcessStartedMessage(content=" + this.content + ", code=" + this.code + ')';
    }
}
