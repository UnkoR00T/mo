package p115tc2;

import al0.BECommunityOffice;
import al0.BEContactDetailsData;
import hl0.IdCardInvalidationTheftDescription;
import nb2.SummaryModel;
import ob2.WelcomeData;
import oq.p;
import p071kotlin.Metadata;
import p119ub2.h1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ltc2/c;", "Lh00/a;", "Lub2/h1;", "", "Lnb2/a;", "<init>", "()V", "g", "()Lnb2/a;", "identitycardinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c extends h00.a<h1, Object, SummaryModel> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f189469c = h00.a.f79185b;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f189470a;

        static {
            int[] iArr = new int[hl0.c.values().length];
            try {
                iArr[hl0.c.LOSS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[hl0.c.DAMAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[hl0.c.IDENTITY_THEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f189470a = iArr;
        }
    }

    @Override // h00.a
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public SummaryModel e() {
        hl0.a loss;
        mb2.a aVar = (mb2.a) f(h1.g.f197341b);
        WelcomeData welcomeData = (WelcomeData) f(h1.n.f197348b);
        int i15 = a.f189470a[aVar.getInvalidationReason().ordinal()];
        if (i15 == 1) {
            loss = new hl0.a.Loss(welcomeData.getInitData());
        } else if (i15 == 2) {
            loss = new hl0.a.Damage(welcomeData.getInitData());
        } else {
            if (i15 != 3) {
                throw new p();
            }
            loss = new hl0.a.Theft(welcomeData.getInitData(), (BEContactDetailsData) f(h1.a.f197335b), (IdCardInvalidationTheftDescription) f(h1.m.f197347b), (BECommunityOffice) f(h1.i.f197343b));
        }
        return new SummaryModel(loss, aVar.getUserEdorAddress());
    }
}
