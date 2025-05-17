-- 比较线程标识与锁中标识是否一致
if(redis.call('get',keys[1] == argv[1])) then
    -- 释放锁
    return redis.call('del',keys[1])
end
return 0