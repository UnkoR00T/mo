package lc;

import kc.Extras;
import kc.m;
import p071kotlin.Metadata;
import zc.ImageRequest;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\"\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003\"\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0003\"\u001e\u0010\u000b\u001a\u00020\u0001*\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u0005\u0010\b\"\u001e\u0010\r\u001a\u00020\u0001*\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b\f\u0010\n\u001a\u0004\b\u0002\u0010\b¨\u0006\u000e"}, d2 = {"Lkc/l$c;", "", "a", "Lkc/l$c;", "useExistingImageAsPlaceholderKey", "b", "preferEndFirstIntrinsicSizeKey", "Lzc/f;", "(Lzc/f;)Z", "getUseExistingImageAsPlaceholder$annotations", "(Lzc/f;)V", "useExistingImageAsPlaceholder", "getPreferEndFirstIntrinsicSize$annotations", "preferEndFirstIntrinsicSize", "coil-compose-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Extras.c<Boolean> f117748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Extras.c<Boolean> f117749b;

    static {
        Boolean bool = Boolean.FALSE;
        f117748a = new Extras.c<>(bool);
        f117749b = new Extras.c<>(bool);
    }

    public static final boolean a(ImageRequest imageRequest) {
        return ((Boolean) m.a(imageRequest, f117749b)).booleanValue();
    }

    public static final boolean b(ImageRequest imageRequest) {
        return ((Boolean) m.a(imageRequest, f117748a)).booleanValue();
    }
}
