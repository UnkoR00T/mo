package vk;

import jg.s;

/* JADX INFO: loaded from: classes4.dex */
public class j extends Exception {
    @Deprecated
    protected j() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(String str) {
        super(str);
        s.g(str, "Detail message must not be empty");
    }
}
