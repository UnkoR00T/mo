package com.pl.pwpw.mobile.edoapp.edoLibrary.messages;

import dv.g;
import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u0000 \u001f2\u00020\u0001:\u0001 B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ8\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001d\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001e\u0010\r¨\u0006!"}, d2 = {"Lcom/pl/pwpw/mobile/edoapp/edoLibrary/messages/ProcessProgressMessage;", "Lcom/pl/pwpw/mobile/edoapp/edoLibrary/messages/IMessage;", "", "content", "", "code", "progress", "totalProgress", "<init>", "(Ljava/lang/String;III)V", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "component4", "copy", "(Ljava/lang/String;III)Lcom/pl/pwpw/mobile/edoapp/edoLibrary/messages/ProcessProgressMessage;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getContent", "I", "getCode", "getProgress", "getTotalProgress", "Companion", "nuL/g", "edoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ProcessProgressMessage implements IMessage {
    public static final g Companion = new g();
    private final int code;
    private final String content;
    private final int progress;
    private final int totalProgress;

    public ProcessProgressMessage(String str, int i15, int i16, int i17) {
        this.content = str;
        this.code = i15;
        this.progress = i16;
        this.totalProgress = i17;
    }

    public static /* synthetic */ ProcessProgressMessage copy$default(ProcessProgressMessage processProgressMessage, String str, int i15, int i16, int i17, int i18, Object obj) {
        if ((i18 & 1) != 0) {
            str = processProgressMessage.content;
        }
        if ((i18 & 2) != 0) {
            i15 = processProgressMessage.code;
        }
        if ((i18 & 4) != 0) {
            i16 = processProgressMessage.progress;
        }
        if ((i18 & 8) != 0) {
            i17 = processProgressMessage.totalProgress;
        }
        return processProgressMessage.copy(str, i15, i16, i17);
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
    public final int getProgress() {
        return this.progress;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getTotalProgress() {
        return this.totalProgress;
    }

    public final ProcessProgressMessage copy(String content, int code, int progress, int totalProgress) {
        return new ProcessProgressMessage(content, code, progress, totalProgress);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProcessProgressMessage)) {
            return false;
        }
        ProcessProgressMessage processProgressMessage = (ProcessProgressMessage) other;
        return t.c(this.content, processProgressMessage.content) && this.code == processProgressMessage.code && this.progress == processProgressMessage.progress && this.totalProgress == processProgressMessage.totalProgress;
    }

    @Override // com.pl.pwpw.mobile.edoapp.edoLibrary.messages.IMessage
    public int getCode() {
        return this.code;
    }

    @Override // com.pl.pwpw.mobile.edoapp.edoLibrary.messages.IMessage
    public String getContent() {
        return this.content;
    }

    public final int getProgress() {
        return this.progress;
    }

    public final int getTotalProgress() {
        return this.totalProgress;
    }

    public int hashCode() {
        return Integer.hashCode(this.totalProgress) + ((Integer.hashCode(this.progress) + ((Integer.hashCode(this.code) + (this.content.hashCode() * 31)) * 31)) * 31);
    }

    public String toString() {
        return "ProcessProgressMessage(content=" + this.content + ", code=" + this.code + ", progress=" + this.progress + ", totalProgress=" + this.totalProgress + ')';
    }
}
