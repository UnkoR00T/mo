package ay2;

import cy2.UserEdorAddressWrapper;
import iy.b0;
import oq.p;
import p071kotlin.Metadata;
import zx2.c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lay2/b;", "Lay2/a;", "Ldy2/a;", "myselfFactory", "Lvx2/a;", "childFactory", "Lgy2/a;", "wardFactory", "<init>", "(Ldy2/a;Lvx2/a;Lgy2/a;)V", "Llv2/a;", "applicationOwner", "", "isIdentityPhotoFeatureEnabled", "Liy/b0;", "userEdorAddress", "Lzx2/c;", "a", "(Llv2/a;ZLiy/b0;)Lzx2/c;", "Ldy2/a;", "b", "Lvx2/a;", "c", "Lgy2/a;", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements ay2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final dy2.a myselfFactory;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final vx2.a childFactory;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final gy2.a wardFactory;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15239a;

        static {
            int[] iArr = new int[lv2.a.values().length];
            try {
                iArr[lv2.a.MYSELF.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[lv2.a.CHILD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[lv2.a.WARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f15239a = iArr;
        }
    }

    public b(dy2.a aVar, vx2.a aVar2, gy2.a aVar3) {
        this.myselfFactory = aVar;
        this.childFactory = aVar2;
        this.wardFactory = aVar3;
    }

    @Override // ay2.a
    public c a(lv2.a applicationOwner, boolean isIdentityPhotoFeatureEnabled, b0 userEdorAddress) {
        int i15 = a.f15239a[applicationOwner.ordinal()];
        if (i15 == 1) {
            return this.myselfFactory.a(isIdentityPhotoFeatureEnabled, new UserEdorAddressWrapper(userEdorAddress));
        }
        if (i15 == 2) {
            return this.childFactory.a(isIdentityPhotoFeatureEnabled, new UserEdorAddressWrapper(userEdorAddress));
        }
        if (i15 == 3) {
            return this.wardFactory.a(isIdentityPhotoFeatureEnabled, new UserEdorAddressWrapper(userEdorAddress));
        }
        throw new p();
    }
}
