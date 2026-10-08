package kr;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lkr/a;", "Ljr/a;", "<init>", "()V", "", "from", "until", "g", "(II)I", "Ljava/util/Random;", "h", "()Ljava/util/Random;", "impl", "kotlin-stdlib-jdk8"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends jr.a {
    @Override // jr.c
    public int g(int from, int until) {
        return ThreadLocalRandom.current().nextInt(from, until);
    }

    @Override // jr.a
    public Random h() {
        return ThreadLocalRandom.current();
    }
}
