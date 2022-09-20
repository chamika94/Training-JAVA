import { successResponse } from "@libs/api-gateway";

const greeting = async (event) => {
    return successResponse({
        message:'hello from SLS based lamda',
    });
};

export const main = greeting;