package l23;

import fu.o;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0007\"\u0017\u0010\u0004\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0001\u0010\u0003\"\u0017\u0010\u0006\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0005\u0010\u0003¨\u0006\u0007"}, d2 = {"Lfu/o;", "a", "Lfu/o;", "()Lfu/o;", "ALLOWED_CHARS_ALPHA_NUMERIC_REGEX_1", "b", "ALLOWED_CHARS_ALPHA_NUMERIC_REGEX_2", "sanitary_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final o f115433a = new o("^[\\p{L}\\d .,?!\\-:;()„\"]+$");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final o f115434b = new o("^[\\p{L}\\d .,?!\\-:;()„\"/]+$");

    public static final o a() {
        return f115433a;
    }

    public static final o b() {
        return f115434b;
    }
}
