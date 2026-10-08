package x02;

import dx.i;
import eo0.Recipient;
import eo0.y0;
import fr.t;
import java.util.List;
import m22.h;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p02.s0;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001:\u0001\u000eB\u0011\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\n2\u0006\u0010\t\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lx02/a;", "", "Lx02/a$a;", "", "Leo0/k0;", "Lp02/s0;", "validateRecipientUC", "<init>", "(Lp02/s0;)V", "params", "Ldx/i;", "Ldx/b$c;", "d", "(Lx02/a$a;Ltq/e;)Ljava/lang/Object;", "a", "Lp02/s0;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements gz.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f216162b = dx.b.Business.f45029h;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final s0 validateRecipientUC;

    /* JADX INFO: renamed from: x02.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0015\u0010\u001f¨\u0006 "}, d2 = {"Lx02/a$a;", "Lgz/b$a;", "Leo0/k0;", "recipientToAdd", "Lm22/h;", "messageWizardContract", "Leo0/y0;", "messageServiceType", "<init>", "(Leo0/k0;Lm22/h;Leo0/y0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Leo0/k0;", "o", "()Leo0/k0;", "b", "Lm22/h;", "p", "()Lm22/h;", "c", "Leo0/y0;", "()Leo0/y0;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Recipient recipientToAdd;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final h messageWizardContract;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final y0 messageServiceType;

        public Params(Recipient recipient, h hVar, y0 y0Var) {
            this.recipientToAdd = recipient;
            this.messageWizardContract = hVar;
            this.messageServiceType = y0Var;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final y0 getMessageServiceType() {
            return this.messageServiceType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.recipientToAdd, params.recipientToAdd) && t.c(this.messageWizardContract, params.messageWizardContract) && this.messageServiceType == params.messageServiceType;
        }

        public int hashCode() {
            return (((this.recipientToAdd.hashCode() * 31) + this.messageWizardContract.hashCode()) * 31) + this.messageServiceType.hashCode();
        }

        /* JADX INFO: renamed from: o, reason: from getter */
        public final Recipient getRecipientToAdd() {
            return this.recipientToAdd;
        }

        /* JADX INFO: renamed from: p, reason: from getter */
        public final h getMessageWizardContract() {
            return this.messageWizardContract;
        }

        public String toString() {
            return "Params(recipientToAdd=" + this.recipientToAdd + ", messageWizardContract=" + this.messageWizardContract + ", messageServiceType=" + this.messageServiceType + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f216167d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f216168e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f216169f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f216170g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f216172j;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f216170g = obj;
            this.f216172j |= PKIFailureInfo.systemUnavail;
            return a.this.d(null, this);
        }
    }

    public a(s0 s0Var) {
        this.validateRecipientUC = s0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object d(Params params, tq.e<? super i<dx.b.Business, ? extends List<Recipient>>> eVar) throws Throwable {
        b bVar;
        Params params2;
        List<Recipient> list;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f216172j;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f216172j = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object obj = bVar.f216170g;
        Object objE = uq.b.e();
        int i16 = bVar.f216172j;
        if (i16 == 0) {
            u.b(obj);
            o02.b.AddRecipients addRecipientsH6 = params.getMessageWizardContract().H6();
            List<Recipient> listA = addRecipientsH6 != null ? addRecipientsH6.a() : null;
            if (listA == null) {
                listA = v.n();
            }
            s0 s0Var = this.validateRecipientUC;
            s0.Params params3 = new s0.Params(params.getRecipientToAdd(), listA, params.getMessageWizardContract().v6().getEntryPoint(), params.getMessageServiceType());
            bVar.f216167d = params;
            bVar.f216168e = listA;
            bVar.f216169f = 0;
            bVar.f216172j = 1;
            Object objF = s0Var.f(params3, bVar);
            if (objF == objE) {
                return objE;
            }
            params2 = params;
            list = listA;
            obj = objF;
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (List) bVar.f216168e;
            params2 = (Params) bVar.f216167d;
            u.b(obj);
        }
        i iVar = (i) obj;
        if (iVar instanceof i.Left) {
            return iVar;
        }
        if (!(iVar instanceof i.Right)) {
            throw new p();
        }
        List list2 = (List) ((i.Right) iVar).b();
        if (list.isEmpty()) {
            params2.getMessageWizardContract().reset();
        }
        params2.getMessageWizardContract().k6(new o02.b.AddRecipients(list2));
        return new i.Right(list2);
    }
}
