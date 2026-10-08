package o31;

import bl0.s;
import java.util.List;
import oq.p;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lo31/a;", "Lgz/a;", "Lbl0/s;", "", "Lbl0/g;", "<init>", "()V", "params", "b", "(Lbl0/s;)Ljava/util/List;", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements gz.a<s, List<? extends bl0.g>> {

    /* JADX INFO: renamed from: o31.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C3491a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f141822a;

        static {
            int[] iArr = new int[s.values().length];
            try {
                iArr[s.IAmNotRegistered.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[s.MeAndFatherAreNotRegistered.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[s.MeAndMotherAreNotRegistered.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[s.MyTemporaryAddress.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[s.TemporaryFatherAddress.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[s.TemporaryMotherAddress.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[s.DoesNotRegisterChild.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[s.MyPermanentAddress.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[s.PermanentFatherAddress.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[s.PermanentMotherAddress.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            f141822a = iArr;
        }
    }

    public List<bl0.g> b(s params) {
        switch (C3491a.f141822a[params.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return v.I0(bl0.g.e(), bl0.g.MyRegisteredAddress);
            case 8:
            case 9:
            case 10:
                return bl0.g.e();
            default:
                throw new p();
        }
    }
}
