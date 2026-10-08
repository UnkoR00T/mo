package q22;

import fr.t;
import m22.b;
import m22.f;
import m22.j;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: q22.a, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001a\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010 \u001a\u0004\b\u001d\u0010!¨\u0006\""}, d2 = {"Lq22/a;", "", "Lm22/j;", "startContract", "Lm22/a;", "addRecipientContract", "Lm22/f;", "messageFormContract", "Lm22/b;", "messageTypeContract", "<init>", "(Lm22/j;Lm22/a;Lm22/f;Lm22/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lm22/j;", "d", "()Lm22/j;", "b", "Lm22/a;", "()Lm22/a;", "c", "Lm22/f;", "()Lm22/f;", "Lm22/b;", "()Lm22/b;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EdorMessageSetupData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final j startContract;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final m22.a addRecipientContract;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final f messageFormContract;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final b messageTypeContract;

    public EdorMessageSetupData(j jVar, m22.a aVar, f fVar, b bVar) {
        this.startContract = jVar;
        this.addRecipientContract = aVar;
        this.messageFormContract = fVar;
        this.messageTypeContract = bVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final m22.a getAddRecipientContract() {
        return this.addRecipientContract;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final f getMessageFormContract() {
        return this.messageFormContract;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final b getMessageTypeContract() {
        return this.messageTypeContract;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final j getStartContract() {
        return this.startContract;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EdorMessageSetupData)) {
            return false;
        }
        EdorMessageSetupData edorMessageSetupData = (EdorMessageSetupData) other;
        return t.c(this.startContract, edorMessageSetupData.startContract) && t.c(this.addRecipientContract, edorMessageSetupData.addRecipientContract) && t.c(this.messageFormContract, edorMessageSetupData.messageFormContract) && t.c(this.messageTypeContract, edorMessageSetupData.messageTypeContract);
    }

    public int hashCode() {
        return (((((this.startContract.hashCode() * 31) + this.addRecipientContract.hashCode()) * 31) + this.messageFormContract.hashCode()) * 31) + this.messageTypeContract.hashCode();
    }

    public String toString() {
        return "EdorMessageSetupData(startContract=" + this.startContract + ", addRecipientContract=" + this.addRecipientContract + ", messageFormContract=" + this.messageFormContract + ", messageTypeContract=" + this.messageTypeContract + ')';
    }
}
