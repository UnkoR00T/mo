package q02;

import dx.i;
import eo0.t;
import eo0.y0;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0013B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ$\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00030\u000f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0019¨\u0006\u001a"}, d2 = {"Lq02/d;", "", "Lq02/d$a;", "Loq/i0;", "Lq02/a;", "deleteEdorDraftUC", "Lq02/e;", "moveToTrashEdorMessageUC", "Lq02/b;", "deleteEdorMessageUC", "Lq02/c;", "deleteEpuapMessageUC", "<init>", "(Lq02/a;Lq02/e;Lq02/b;Lq02/c;)V", "params", "Ldx/i;", "Ldx/b;", "d", "(Lq02/d$a;Ltq/e;)Ljava/lang/Object;", "a", "Lq02/a;", "b", "Lq02/e;", "c", "Lq02/b;", "Lq02/c;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final a deleteEdorDraftUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e moveToTrashEdorMessageUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final q02.b deleteEdorMessageUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final c deleteEpuapMessageUC;

    /* JADX INFO: renamed from: q02.d$a, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Lq02/d$a;", "Lgz/b$a;", "Lfo0/c;", "deliveryMessage", "Leo0/t;", "directoryType", "<init>", "(Lfo0/c;Leo0/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lfo0/c;", "()Lfo0/c;", "b", "Leo0/t;", "()Leo0/t;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final fo0.c deliveryMessage;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final t directoryType;

        public Params(fo0.c cVar, t tVar) {
            this.deliveryMessage = cVar;
            this.directoryType = tVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final fo0.c getDeliveryMessage() {
            return this.deliveryMessage;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final t getDirectoryType() {
            return this.directoryType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return fr.t.c(this.deliveryMessage, params.deliveryMessage) && this.directoryType == params.directoryType;
        }

        public int hashCode() {
            return (this.deliveryMessage.hashCode() * 31) + this.directoryType.hashCode();
        }

        public String toString() {
            return "Params(deliveryMessage=" + this.deliveryMessage + ", directoryType=" + this.directoryType + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f163507a;

        static {
            int[] iArr = new int[t.values().length];
            try {
                iArr[t.DRAFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t.TRASH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f163507a = iArr;
        }
    }

    public d(a aVar, e eVar, q02.b bVar, c cVar) {
        this.deleteEdorDraftUC = aVar;
        this.moveToTrashEdorMessageUC = eVar;
        this.deleteEdorMessageUC = bVar;
        this.deleteEpuapMessageUC = cVar;
    }

    public Object d(Params params, tq.e<? super i<? extends dx.b, i0>> eVar) {
        if (params.getDeliveryMessage().getServiceType() == y0.E_PUAP) {
            return this.deleteEpuapMessageUC.e(new c.Params(params.getDeliveryMessage().getMessageId(), null), eVar);
        }
        int i15 = b.f163507a[params.getDirectoryType().ordinal()];
        if (i15 != 1) {
            return i15 != 2 ? this.moveToTrashEdorMessageUC.e(new e.Params(params.getDeliveryMessage().getMessageId(), null), eVar) : this.deleteEdorMessageUC.e(new q02.b.Params(params.getDeliveryMessage().getMessageId(), null), eVar);
        }
        return this.deleteEdorDraftUC.e(new a.Params(params.getDeliveryMessage().getMessageId(), null), eVar);
    }
}
