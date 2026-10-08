package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class rl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f30576a = "\n";

    private rl(String str) {
    }

    public static rl a(String str) {
        return new rl("\n");
    }

    static final CharSequence c(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public final String b(Iterable iterable) {
        Iterator it = iterable.iterator();
        StringBuilder sb5 = new StringBuilder();
        try {
            if (it.hasNext()) {
                sb5.append(c(it.next()));
                while (it.hasNext()) {
                    sb5.append((CharSequence) this.f30576a);
                    sb5.append(c(it.next()));
                }
            }
            return sb5.toString();
        } catch (IOException e15) {
            throw new AssertionError(e15);
        }
    }
}
