package com.pl.pwpw.mobile.edoapp.edoLibrary.messages;

import dv.a;
import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001dB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\fJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001b\u0010\f¨\u0006\u001e"}, d2 = {"Lcom/pl/pwpw/mobile/edoapp/edoLibrary/messages/IncorrectPinErrorMessage;", "Lcom/pl/pwpw/mobile/edoapp/edoLibrary/messages/IMessage;", "", "content", "", "code", "triesLeft", "<init>", "(Ljava/lang/String;II)V", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "copy", "(Ljava/lang/String;II)Lcom/pl/pwpw/mobile/edoapp/edoLibrary/messages/IncorrectPinErrorMessage;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getContent", "I", "getCode", "getTriesLeft", "Companion", "nuL/a", "edoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class IncorrectPinErrorMessage implements IMessage {
    public static final a Companion = new a();
    private final int code;
    private final String content;
    private final int triesLeft;

    public IncorrectPinErrorMessage(String str, int i15, int i16) {
        this.content = str;
        this.code = i15;
        this.triesLeft = i16;
    }

    public static /* synthetic */ IncorrectPinErrorMessage copy$default(IncorrectPinErrorMessage incorrectPinErrorMessage, String str, int i15, int i16, int i17, Object obj) {
        if ((i17 & 1) != 0) {
            str = incorrectPinErrorMessage.content;
        }
        if ((i17 & 2) != 0) {
            i15 = incorrectPinErrorMessage.code;
        }
        if ((i17 & 4) != 0) {
            i16 = incorrectPinErrorMessage.triesLeft;
        }
        return incorrectPinErrorMessage.copy(str, i15, i16);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getTriesLeft() {
        return this.triesLeft;
    }

    public final IncorrectPinErrorMessage copy(String content, int code, int triesLeft) {
        return new IncorrectPinErrorMessage(content, code, triesLeft);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IncorrectPinErrorMessage)) {
            return false;
        }
        IncorrectPinErrorMessage incorrectPinErrorMessage = (IncorrectPinErrorMessage) other;
        return t.c(this.content, incorrectPinErrorMessage.content) && this.code == incorrectPinErrorMessage.code && this.triesLeft == incorrectPinErrorMessage.triesLeft;
    }

    @Override // com.pl.pwpw.mobile.edoapp.edoLibrary.messages.IMessage
    public int getCode() {
        return this.code;
    }

    @Override // com.pl.pwpw.mobile.edoapp.edoLibrary.messages.IMessage
    public String getContent() {
        return this.content;
    }

    public final int getTriesLeft() {
        return this.triesLeft;
    }

    public int hashCode() {
        return Integer.hashCode(this.triesLeft) + ((Integer.hashCode(this.code) + (this.content.hashCode() * 31)) * 31);
    }

    public String toString() {
        return "IncorrectPinErrorMessage(content=" + this.content + ", code=" + this.code + ", triesLeft=" + this.triesLeft + ')';
    }
}
